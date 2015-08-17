/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_extended_get = "QCOMExtendedGet".nativeClassGLES("QCOM_extended_get", postfix = QCOM) {
	documentation =
		"""
		Native bindings to the $registryLink extension.
		This extension enables instrumenting the driver for debugging of OpenGL ES applications.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of ExtGetTexLevelParameterivQCOM.",

		"TEXTURE_WIDTH_QCOM" _ 0x8BD2,
		"TEXTURE_HEIGHT_QCOM" _ 0x8BD3,
		"TEXTURE_DEPTH_QCOM" _ 0x8BD4,
		"TEXTURE_INTERNAL_FORMAT_QCOM" _ 0x8BD5,
		"TEXTURE_FORMAT_QCOM" _ 0x8BD6,
		"TEXTURE_TYPE_QCOM" _ 0x8BD7,
		"TEXTURE_IMAGE_VALID_QCOM" _ 0x8BD8,
		"TEXTURE_NUM_LEVELS_QCOM" _ 0x8BD9,
		"TEXTURE_TARGET_QCOM" _ 0x8BDA,
		"TEXTURE_OBJECT_VALID_QCOM" _ 0x8BDB
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of ExtTexObjectStateOverrideiQCOM.",

		"STATE_RESTORE" _ 0x8BDC
	)

	void(
		"ExtGetTexturesQCOM",
		"",

		nullable _ GLuint_p.OUT("textures", ""),
		AutoSize("textures") _ GLint.IN("maxTextures", ""),
		nullable _ Check(1) _ GLint_p.OUT("numTextures", "")
	)

	void(
		"ExtGetBuffersQCOM",
		"",

		nullable _ GLuint_p.OUT("buffers", ""),
		AutoSize("buffers") _ GLint.IN("maxBuffers", ""),
		nullable _ Check(1) _ GLint_p.OUT("numBuffers", "")
	)

	void(
		"ExtGetRenderbuffersQCOM",
		"",

		nullable _ GLuint_p.OUT("renderbuffers", ""),
		AutoSize("renderbuffers") _ GLint.IN("maxRenderbuffers", ""),
		nullable _ Check(1) _ GLint_p.OUT("numRenderbuffers", "")
	)

	void(
		"ExtGetFramebuffersQCOM",
		"",

		nullable _ GLuint_p.OUT("framebuffers", ""),
		AutoSize("framebuffers") _ GLint.IN("maxFramebuffers", ""),
		nullable _ Check(1) _ GLint_p.OUT("numFramebuffers", "")
	)

	void(
		"ExtGetTexLevelParameterivQCOM",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("face", ""),
		GLint.IN("level", ""),
		GLenum.IN("pname", ""),
		returnValue _ Check(1) _ GLint_p.OUT("params", "")
	)

	void(
		"ExtTexObjectStateOverrideiQCOM",
		"",

		GLenum.IN("target", ""),
		GLenum.IN("pname", ""),
		GLint.IN("param", "")
	)

	void(
		"ExtGetTexSubImageQCOM",
		"",

		GLenum.IN("target", ""),
		GLint.IN("level", ""),
		GLint.IN("xoffset", ""),
		GLint.IN("yoffset", ""),
		GLint.IN("zoffset", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLenum.IN("format", ""),
		GLenum.IN("type", ""),
		void_p.OUT("texels", "")
	)

	void(
		"ExtGetBufferPointervQCOM",
		"",

		GLenum.IN("target", ""),
		returnValue _ Check(1) _ void_pp.OUT("params", "")
	)
}