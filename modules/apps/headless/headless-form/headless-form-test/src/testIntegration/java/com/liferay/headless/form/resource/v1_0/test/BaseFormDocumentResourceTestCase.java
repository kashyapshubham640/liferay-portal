/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.headless.form.resource.v1_0.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.liferay.headless.form.dto.v1_0.FormDocument;
import com.liferay.headless.form.dto.v1_0.Options;
import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.test.util.GroupTestUtil;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.util.Base64;
import com.liferay.portal.kernel.util.Http;
import com.liferay.portal.kernel.util.HttpUtil;

import java.net.URL;

import javax.annotation.Generated;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public abstract class BaseFormDocumentResourceTestCase {

	@Before
	public void setUp() throws Exception {
		testGroup = GroupTestUtil.addGroup();

		_resourceURL = new URL(
			"http://localhost:8080/o/headless-form/v1.0");
	}

	@After
	public void tearDown() throws Exception {
		GroupTestUtil.deleteGroup(testGroup);
	}

	@Test
	public void testDeleteFormDocument() throws Exception {
			Assert.assertTrue(true);
	}
	@Test
	public void testGetFormDocument() throws Exception {
			Assert.assertTrue(true);
	}

	protected void assertResponseCode(int expectedResponseCode, Http.Response actualResponse) {
		Assert.assertEquals(expectedResponseCode, actualResponse.getResponseCode());
	}

	protected boolean invokeDeleteFormDocument(
				Long formDocumentId)
			throws Exception {

			Http.Options options = _createHttpOptions();

				options.setDelete(true);

			options.setLocation(_resourceURL + _toPath("/form-documents/{form-document-id}", formDocumentId));

				return _outputObjectMapper.readValue(HttpUtil.URLtoString(options), Boolean.class);
	}

	protected Http.Response invokeDeleteFormDocumentResponse(
				Long formDocumentId)
			throws Exception {

			Http.Options options = _createHttpOptions();

				options.setDelete(true);

			options.setLocation(_resourceURL + _toPath("/form-documents/{form-document-id}", formDocumentId));

			HttpUtil.URLtoString(options);

			return options.getResponse();
	}
	protected FormDocument invokeGetFormDocument(
				Long formDocumentId)
			throws Exception {

			Http.Options options = _createHttpOptions();

			options.setLocation(_resourceURL + _toPath("/form-documents/{form-document-id}", formDocumentId));

				return _outputObjectMapper.readValue(HttpUtil.URLtoString(options), FormDocumentImpl.class);
	}

	protected Http.Response invokeGetFormDocumentResponse(
				Long formDocumentId)
			throws Exception {

			Http.Options options = _createHttpOptions();

			options.setLocation(_resourceURL + _toPath("/form-documents/{form-document-id}", formDocumentId));

			HttpUtil.URLtoString(options);

			return options.getResponse();
	}

	protected FormDocument randomFormDocument() {
		return new FormDocumentImpl() {
			{

						contentUrl = RandomTestUtil.randomString();
						encodingFormat = RandomTestUtil.randomString();
						fileExtension = RandomTestUtil.randomString();
						id = RandomTestUtil.randomLong();
						title = RandomTestUtil.randomString();
	}
		};
	}

	protected Group testGroup;

	protected static class FormDocumentImpl implements FormDocument {

	public String getContentUrl() {
				return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
				this.contentUrl = contentUrl;
	}

	@JsonIgnore
	public void setContentUrl(
				UnsafeSupplier<String, Throwable> contentUrlUnsafeSupplier) {

				try {
					contentUrl = contentUrlUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected String contentUrl;
	public String getEncodingFormat() {
				return encodingFormat;
	}

	public void setEncodingFormat(String encodingFormat) {
				this.encodingFormat = encodingFormat;
	}

	@JsonIgnore
	public void setEncodingFormat(
				UnsafeSupplier<String, Throwable> encodingFormatUnsafeSupplier) {

				try {
					encodingFormat = encodingFormatUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected String encodingFormat;
	public String getFileExtension() {
				return fileExtension;
	}

	public void setFileExtension(String fileExtension) {
				this.fileExtension = fileExtension;
	}

	@JsonIgnore
	public void setFileExtension(
				UnsafeSupplier<String, Throwable> fileExtensionUnsafeSupplier) {

				try {
					fileExtension = fileExtensionUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected String fileExtension;
	public Long getId() {
				return id;
	}

	public void setId(Long id) {
				this.id = id;
	}

	@JsonIgnore
	public void setId(
				UnsafeSupplier<Long, Throwable> idUnsafeSupplier) {

				try {
					id = idUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected Long id;
	public Number getSizeInBytes() {
				return sizeInBytes;
	}

	public void setSizeInBytes(Number sizeInBytes) {
				this.sizeInBytes = sizeInBytes;
	}

	@JsonIgnore
	public void setSizeInBytes(
				UnsafeSupplier<Number, Throwable> sizeInBytesUnsafeSupplier) {

				try {
					sizeInBytes = sizeInBytesUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected Number sizeInBytes;
	public String getTitle() {
				return title;
	}

	public void setTitle(String title) {
				this.title = title;
	}

	@JsonIgnore
	public void setTitle(
				UnsafeSupplier<String, Throwable> titleUnsafeSupplier) {

				try {
					title = titleUnsafeSupplier.get();
	}
				catch (Throwable t) {
					throw new RuntimeException(t);
	}
	}

	@JsonProperty
	protected String title;

	}

	private Http.Options _createHttpOptions() {
		Http.Options options = new Http.Options();

		options.addHeader("Accept", "application/json");

		String userNameAndPassword = "test@liferay.com:test";

		String encodedUserNameAndPassword = Base64.encode(userNameAndPassword.getBytes());

		options.addHeader("Authorization", "Basic " + encodedUserNameAndPassword);

		options.addHeader("Content-Type", "application/json");

		return options;
	}

	private String _toPath(String template, Object... values) {
		return template.replaceAll("\\{.*\\}", String.valueOf(values[0]));
	}

	private final static ObjectMapper _inputObjectMapper = new ObjectMapper() {
		{
			setSerializationInclusion(JsonInclude.Include.NON_NULL);
	}
	};
	private final static ObjectMapper _outputObjectMapper = new ObjectMapper();

	private URL _resourceURL;

}