import org.elasticsearch.spark.sql._
import java.sql.Date
import org.apache.spark.sql.functions.{col, regexp_replace, udf, _}
object AgricultureMain {
  def main(args: Array[String]): Unit = {

    val index = args(0)
    val spark = org.apache.spark.sql.SparkSession.builder
      .master("local")
      .appName("Spark App")
      .config("spark.es.nodes","localhost")
      .config("spark.es.port","9200")
      .getOrCreate;
    val df = spark.read.format("csv").option("header", "true").load("hdfs://localhost:9000/user/sgc/FarmData/Agriculture.csv")
    val toInt    = udf[Int, String]( _.toInt)
    val toDouble = udf[Double, String]( _.toDouble)
    val toLong = udf[Long, String]( _.toLong)
    val data=df.select("RowKey","SkuId","TimeStamp60","Timestamp62","RawChannel0","RawChannel1","RawChannel10","RawChannel11","RawChannel12","RawChannel13","RawChannel2","RawChannel3","RawChannel4","RawChannel5","RawChannel6","RawChannel7","RawChannel8","RawChannel9")
    val featureDf = data
      .withColumn("skuId", toInt(data("SkuId")))
      .withColumn("rowKey", toLong(data("RowKey")))
      .withColumn("temperature", toDouble(data("RawChannel0")))
      .withColumn("humidity", toDouble(data("RawChannel1")))
      .withColumn("pressure", toDouble(data("RawChannel2")))
      .withColumn("soilMoisture", toDouble(data("RawChannel3")))
      .withColumn("soilTemperature", toDouble(data("RawChannel4")))
      .withColumn("ambientTemperature", toDouble(data("RawChannel5")))
      .withColumn("ambientHumidity", toDouble(data("RawChannel6")))
      .withColumn("atmosphericPressure", toDouble(data("RawChannel7")))
      .withColumn("c02Value", toDouble(data("RawChannel8")))
      .withColumn("lightIntensity", toDouble(data("RawChannel9")))
      .withColumn("windSpeed", toDouble(data("RawChannel10")))
      .withColumn("windDirection", toDouble(data("RawChannel11")))
      .withColumn("rainValue", toDouble(data("RawChannel12")))
      .withColumn("batteryLevel", toDouble(data("RawChannel13")))
    .withColumn("sensorStartTime", col("TimeStamp60").cast("timestamp"))
      .withColumn("sensorEndTime", col("TimeStamp62").cast("timestamp"))
      .withColumn("dataCollectionDate", col("TimeStamp60").cast("date"))
      .withColumn("dataCollectionDateString",   col("dataCollectionDate").cast("string"))
    val finalData = featureDf.drop("TimeStamp60","TimeStamp62","RawChannel0","RawChannel1","RawChannel10","RawChannel11","RawChannel12","RawChannel13","RawChannel2","RawChannel3","RawChannel4","RawChannel5","RawChannel6","RawChannel7","RawChannel8","RawChannel9")
    //finalData.show(1)
    finalData.saveToEs(index)
  }
}






