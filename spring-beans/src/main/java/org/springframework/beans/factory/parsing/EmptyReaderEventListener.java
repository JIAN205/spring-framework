/*
 * Copyright 2002-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.beans.factory.parsing;

/**
 * Empty implementation of the {@link ReaderEventListener} interface,
 * providing no-op implementations of all callback methods.
 * <p>
 * Spring提供的相关事件的空实现，作为拓展点留给开发人员自定义
 *
 * @author Juergen Hoeller
 * @since 2.0
 */
public class EmptyReaderEventListener implements ReaderEventListener {

	@Override
	public void defaultsRegistered(DefaultsDefinition defaultsDefinition) {
		// no-op
	}

	@Override
	public void componentRegistered(ComponentDefinition componentDefinition) {
		// no-op
		System.out.println("Bean完成注册之后调用的事件");
	}

	@Override
	public void aliasRegistered(AliasDefinition aliasDefinition) {
		// no-op
	}

	@Override
	public void importProcessed(ImportDefinition importDefinition) {
		// no-op
	}

}