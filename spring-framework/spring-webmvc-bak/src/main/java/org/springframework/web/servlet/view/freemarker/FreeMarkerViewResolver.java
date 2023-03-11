/*
 * Copyright 2002-2009 the original author or authors.
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

package org.springframework.web.servlet.view.freemarker;

import org.springframework.web.servlet.view.AbstractTemplateViewResolver;

/**
 * Convenience subclass of
 * {@link org.springframework.web.servlet.view.UrlBasedViewResolver} that supports
 * {@link FreeMarkerView} (i.e. FreeMarker templates) and custom subclasses of it.
 *
 * <p>
 * The view class for all views generated by this resolver can be specified via the
 * "viewClass" property. See UrlBasedViewResolver's javadoc for details.
 *
 * <p>
 * <b>Note:</b> When chaining ViewResolvers, a FreeMarkerViewResolver will check for the
 * existence of the specified template resources and only return a non-null View object if
 * the template was actually found.
 *
 * @author Juergen Hoeller
 * @since 1.1
 * @see #setViewClass
 * @see #setPrefix
 * @see #setSuffix
 * @see #setRequestContextAttribute
 * @see #setExposeSpringMacroHelpers
 * @see FreeMarkerView
 */
public class FreeMarkerViewResolver extends AbstractTemplateViewResolver {

	/**
	 * Sets the default {@link #setViewClass view class} to {@link #requiredViewClass}: by
	 * default {@link FreeMarkerView}.
	 */
	public FreeMarkerViewResolver() {
		setViewClass(requiredViewClass());
	}

	/**
	 * A convenience constructor that allows for specifying {@link #setPrefix prefix} and
	 * {@link #setSuffix suffix} as constructor arguments.
	 * @param prefix the prefix that gets prepended to view names when building a URL
	 * @param suffix the suffix that gets appended to view names when building a URL
	 * @since 4.3
	 */
	public FreeMarkerViewResolver(String prefix, String suffix) {
		this();
		setPrefix(prefix);
		setSuffix(suffix);
	}

	/**
	 * Requires {@link FreeMarkerView}.
	 */
	@Override
	protected Class<?> requiredViewClass() {
		return FreeMarkerView.class;
	}

}
