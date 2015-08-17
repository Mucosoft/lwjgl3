/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_ES3_2_compatibility = "ARBES32Compatibility".nativeClassGL("ARB_ES3_2_compatibility") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds support for features of OpenGL ES 3.2 that are missing from OpenGL 4.5. Enabling these features will ease the process of porting
		applications from OpenGL ES 3.2 to OpenGL.

		In particular this adds the following features:
		${ul(
			"Bounding box used to optimization tessellation processing (OES_primitive_bounding_box)",
			"query for #MULTISAMPLE_LINE_WIDTH_RANGE_ARB",
			"support for the OpenGL ES 3.20 shading language"
		)}
		For full OpenGL ES 3.2 compatibility the implementation must support ${KHR_blend_equation_advanced.link} and ${KHR_texture_compression_astc_ldr.link}.
		Those features are not defined in this extension spec since they are already defined at the KHR level.

		Requires ${GL45.core}, ${ARB_ES2_compatibility.link}, ${ARB_ES3_compatibility.link} and ${ARB_ES3_1_compatibility.link}.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetFloatv, GetIntegerv, and GetInteger64v.",

		"PRIMITIVE_BOUNDING_BOX_ARB" _ 0x92BE,
		"MULTISAMPLE_LINE_WIDTH_RANGE_ARB" _ 0x9381,
		"MULTISAMPLE_LINE_WIDTH_GRANULARITY_ARB" _ 0x9382
	)

	void(
		"PrimitiveBoundingBoxARB",
		"""
		Specifies the primitive bounding box.

		Implementations may be able to optimize performance if the application provides bounds of primitives that will be generated by the tessellation
		primitive generator or the geometry shader prior to executing those stages. If the provided bounds are incorrect and primitives extend beyond them, the
		rasterizer may or may not generate fragments for the portions of primitives outside the bounds.
		""",

		GLfloat.IN("minX", "the minimum x clip space coordinate"),
		GLfloat.IN("minY", "the minimum y clip space coordinate"),
		GLfloat.IN("minZ", "the minimum z clip space coordinate"),
		GLfloat.IN("minW", "the minimum w clip space coordinate"),
		GLfloat.IN("maxX", "the maximum x clip space coordinate"),
		GLfloat.IN("maxY", "the maximum y clip space coordinate"),
		GLfloat.IN("maxZ", "the maximum z clip space coordinate"),
		GLfloat.IN("maxW", "the maximum w clip space coordinate")
	)
}