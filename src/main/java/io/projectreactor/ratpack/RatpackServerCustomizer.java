/*
 * Copyright (c) 2011-2016 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.projectreactor.ratpack;

import java.util.List;

import ratpack.func.Action;
import ratpack.guice.BindingsSpec;
import ratpack.handling.Chain;
import ratpack.server.ServerConfig.Builder;

/**
 * @author Dave Syer
 *
 */
public interface RatpackServerCustomizer {

	List<Action<Chain>> getHandlers();

	Action<BindingsSpec> getBindings();

	Action<Builder> getServerConfig();

}
