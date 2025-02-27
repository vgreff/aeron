/*
 * Copyright 2014-2021 Real Logic Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.aeron.cluster;

/**
 * Supplier of {@link TimerService} implementations to be used by the {@link ConsensusModule}.
 */
@FunctionalInterface
public interface TimerServiceSupplier
{
    /**
     * New instance of the {@link TimerService}.
     *
     * @param timerHandler that must be invoked for each expired timer.
     * @return timer service instance ready for immediate usage.
     */
    TimerService newInstance(TimerService.TimerHandler timerHandler);
}
