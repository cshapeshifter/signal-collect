/*
 *  @author Philip Stutz
 *  @author Bharath Kumar
 *
 *  Copyright 2015 iHealth Technologies
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

package com.signalcollect.nodeprovisioning.cluster

import com.typesafe.config.{ Config, ConfigFactory }
import akka.actor.ActorSystem
import com.signalcollect.configuration.Akka
import scala.concurrent.Await
import scala.concurrent.duration.Duration

object ClusterNodeEntryPointTemplate {

  start()

  def config: Config = Akka.config(
    serializeMessages = None,
    loggingLevel = None)

  def systemName: String = "SignalCollect"

  def start(): Unit = {
    val system = ActorSystem(systemName, config)
    Await.ready(system.whenTerminated, Duration.Inf)
  }

}
