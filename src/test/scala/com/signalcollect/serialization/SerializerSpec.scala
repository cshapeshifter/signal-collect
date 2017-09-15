/*
 *  @author Philip Stutz
 *
 *  Copyright 2011 University of Zurich
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.signalcollect.serialization

import com.signalcollect.{ TestConfig, GraphBuilder }
import akka.serialization.SerializationExtension
import org.scalatest.Matchers
import org.scalatest.fixture.FlatSpec
import TestConfig._
import akka.actor.ActorSystem
import com.signalcollect.TestGraph
import org.scalatest.fixture.UnitFixture
import org.scalatest.fixture.NoArg

class SerializerSpec extends FlatSpec with Matchers with UnitFixture {

  "DefaultSerializer" should "correctly serialize/deserialize a Double" in new NoArg {
    DefaultSerializer.read[Double](DefaultSerializer.write(1024.0)) shouldBe 1024.0
  }

  it should "correctly serialize/deserialize a job configuration" in new NoArg {
    val job = new Job(
      100,
      Some(SpreadsheetConfiguration("some.emailAddress@gmail.com", "somePasswordHere", "someSpreadsheetNameHere", "someWorksheetNameHere")),
      "someUsername",
      "someJobDescription")
    DefaultSerializer.read[Job](DefaultSerializer.write(job)) shouldBe job
  }

}

case class SpreadsheetConfiguration(
  gmailAccount: String,
  gmailPassword: String,
  spreadsheetName: String,
  worksheetName: String)

case class Job(
  var jobId: Int,
  var spreadsheetConfiguration: Option[SpreadsheetConfiguration],
  var submittedByUser: String,
  var jobDescription: String)
