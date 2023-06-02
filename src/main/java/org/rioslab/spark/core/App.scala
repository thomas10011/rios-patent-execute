package org.rioslab.spark.core
import org.rioslab.spark.core.util.CacheUtil
import org.rioslab.spark.core.wc.WordCountSQL

object App {
    def main(args: Array[String]): Unit = {
        // 0号参数作为 task id
        val taskID = args(0)
        val res = WordCountSQL.run(args)
        if (res != null && res.nonEmpty) CacheUtil.set(taskID, res)
    }
}