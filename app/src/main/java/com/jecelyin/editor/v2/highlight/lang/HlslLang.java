/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor.v2.highlight.lang;

import com.jecelyin.editor.v2.highlight.LangDefine;

/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class HlslLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\".,+-*/=<>?^&[]{}\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(((if|while)\\\\s*\\\\(|else\\\\s*|else\\\\s+if\\\\s*\\\\(|for\\\\s*\\\\(.*\\\\))[^{;]*)\",\"NAME\":\"indentNextLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"doubleBracketIndent\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"true\",\"NAME\":\"lineUpClosingBracket\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"((0[xX][0-9a-fA-F]+|\\\\d+)[uUIL]?|\\\\d+([eE]\\\\d*)?[hHfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"##\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"SEQ\",\"text\":\"#@\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"Preprocessor\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"EXCLUDE_MATCH\":\"FALSE\",\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"Asm\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"asm\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"EXCLUDE_MATCH\":\"FALSE\",\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"Asm\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"ASM\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"EXCLUDE_MATCH\":\"FALSE\",\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"Asm\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"Asm\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"EXCLUDE_MATCH\":\"FALSE\",\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"Asm\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"asm_fragment\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SEQ\",\"text\":\"++\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"--\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"||\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"==\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"::\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">>=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"...\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"->\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"EXCLUDE_MATCH\":\"TRUE\",\"TYPE\":\"FUNCTION\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\".(([xyzw]{1,4})|([rgba]{1,4})|((_m[0123][0123])+)|((_[1234][1234])+))(?!\\\\p{Alnum})\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\".\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"bool[1234](x[1234])?\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"bool\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"int[1234](x[1234])?\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"int\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"half[1234](x[1234])?\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"half\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"float[1234](x[1234])?\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"float\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"double[1234](x[1234])?\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"double\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\":\\\\s*(register\\\\s*\\\\(\\\\w+(\\\\s*\\\\,\\\\s*\\\\w+\\\\s*)?\\\\)|\\\\w+)\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\":\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"discard\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"typedef\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"compile\"},{\"tag\":\"KEYWORD1\",\"text\":\"compile_fragment\"},{\"tag\":\"KEYWORD1\",\"text\":\"register\"},{\"tag\":\"KEYWORD1\",\"text\":\"sampler_state\"},{\"tag\":\"KEYWORD1\",\"text\":\"stateblock_state\"},{\"tag\":\"KEYWORD1\",\"text\":\"technique\"},{\"tag\":\"KEYWORD1\",\"text\":\"Technique\"},{\"tag\":\"KEYWORD1\",\"text\":\"TECHNIQUE\"},{\"tag\":\"KEYWORD1\",\"text\":\"pass\"},{\"tag\":\"KEYWORD1\",\"text\":\"Pass\"},{\"tag\":\"KEYWORD1\",\"text\":\"PASS\"},{\"tag\":\"KEYWORD1\",\"text\":\"decl\"},{\"tag\":\"KEYWORD1\",\"text\":\"Decl\"},{\"tag\":\"KEYWORD1\",\"text\":\"DECL\"},{\"tag\":\"KEYWORD2\",\"text\":\"void\"},{\"tag\":\"KEYWORD2\",\"text\":\"bool\"},{\"tag\":\"KEYWORD2\",\"text\":\"int\"},{\"tag\":\"KEYWORD2\",\"text\":\"half\"},{\"tag\":\"KEYWORD2\",\"text\":\"float\"},{\"tag\":\"KEYWORD2\",\"text\":\"double\"},{\"tag\":\"KEYWORD2\",\"text\":\"vector\"},{\"tag\":\"KEYWORD2\",\"text\":\"matrix\"},{\"tag\":\"KEYWORD3\",\"text\":\"string\"},{\"tag\":\"KEYWORD3\",\"text\":\"texture\"},{\"tag\":\"KEYWORD3\",\"text\":\"texture1D\"},{\"tag\":\"KEYWORD3\",\"text\":\"texture2D\"},{\"tag\":\"KEYWORD3\",\"text\":\"texture3D\"},{\"tag\":\"KEYWORD3\",\"text\":\"textureCUBE\"},{\"tag\":\"KEYWORD3\",\"text\":\"sampler\"},{\"tag\":\"KEYWORD3\",\"text\":\"sampler1D\"},{\"tag\":\"KEYWORD3\",\"text\":\"sampler2D\"},{\"tag\":\"KEYWORD3\",\"text\":\"sampler3D\"},{\"tag\":\"KEYWORD3\",\"text\":\"samplerCUBE\"},{\"tag\":\"KEYWORD3\",\"text\":\"pixelfragment\"},{\"tag\":\"KEYWORD3\",\"text\":\"vertexfragment\"},{\"tag\":\"KEYWORD3\",\"text\":\"pixelshader\"},{\"tag\":\"KEYWORD3\",\"text\":\"vertexshader\"},{\"tag\":\"KEYWORD3\",\"text\":\"stateblock\"},{\"tag\":\"KEYWORD3\",\"text\":\"struct\"},{\"tag\":\"KEYWORD4\",\"text\":\"static\"},{\"tag\":\"KEYWORD4\",\"text\":\"uniform\"},{\"tag\":\"KEYWORD4\",\"text\":\"extern\"},{\"tag\":\"KEYWORD4\",\"text\":\"volatile\"},{\"tag\":\"KEYWORD4\",\"text\":\"inline\"},{\"tag\":\"KEYWORD4\",\"text\":\"shared\"},{\"tag\":\"KEYWORD4\",\"text\":\"const\"},{\"tag\":\"KEYWORD4\",\"text\":\"row_major\"},{\"tag\":\"KEYWORD4\",\"text\":\"column_major\"},{\"tag\":\"KEYWORD4\",\"text\":\"in\"},{\"tag\":\"KEYWORD4\",\"text\":\"inout\"},{\"tag\":\"KEYWORD4\",\"text\":\"out\"},{\"tag\":\"LITERAL1\",\"text\":\"false\"},{\"tag\":\"LITERAL1\",\"text\":\"true\"},{\"tag\":\"LITERAL1\",\"text\":\"NULL\"},{\"tag\":\"LITERAL2\",\"text\":\"abs\"},{\"tag\":\"LITERAL2\",\"text\":\"acos\"},{\"tag\":\"LITERAL2\",\"text\":\"all\"},{\"tag\":\"LITERAL2\",\"text\":\"any\"},{\"tag\":\"LITERAL2\",\"text\":\"asin\"},{\"tag\":\"LITERAL2\",\"text\":\"atan\"},{\"tag\":\"LITERAL2\",\"text\":\"atan2\"},{\"tag\":\"LITERAL2\",\"text\":\"ceil\"},{\"tag\":\"LITERAL2\",\"text\":\"clamp\"},{\"tag\":\"LITERAL2\",\"text\":\"clip\"},{\"tag\":\"LITERAL2\",\"text\":\"cos\"},{\"tag\":\"LITERAL2\",\"text\":\"cosh\"},{\"tag\":\"LITERAL2\",\"text\":\"cross\"},{\"tag\":\"LITERAL2\",\"text\":\"D3DCOLORtoUBYTE4\"},{\"tag\":\"LITERAL2\",\"text\":\"ddx\"},{\"tag\":\"LITERAL2\",\"text\":\"ddy\"},{\"tag\":\"LITERAL2\",\"text\":\"degrees\"},{\"tag\":\"LITERAL2\",\"text\":\"determinant\"},{\"tag\":\"LITERAL2\",\"text\":\"distance\"},{\"tag\":\"LITERAL2\",\"text\":\"dot\"},{\"tag\":\"LITERAL2\",\"text\":\"exp\"},{\"tag\":\"LITERAL2\",\"text\":\"exp2\"},{\"tag\":\"LITERAL2\",\"text\":\"faceforward\"},{\"tag\":\"LITERAL2\",\"text\":\"floor\"},{\"tag\":\"LITERAL2\",\"text\":\"fmod\"},{\"tag\":\"LITERAL2\",\"text\":\"frac\"},{\"tag\":\"LITERAL2\",\"text\":\"frexp\"},{\"tag\":\"LITERAL2\",\"text\":\"fwidth\"},{\"tag\":\"LITERAL2\",\"text\":\"isfinite\"},{\"tag\":\"LITERAL2\",\"text\":\"isinf\"},{\"tag\":\"LITERAL2\",\"text\":\"isnan\"},{\"tag\":\"LITERAL2\",\"text\":\"ldexp\"},{\"tag\":\"LITERAL2\",\"text\":\"length\"},{\"tag\":\"LITERAL2\",\"text\":\"lerp\"},{\"tag\":\"LITERAL2\",\"text\":\"lit\"},{\"tag\":\"LITERAL2\",\"text\":\"log\"},{\"tag\":\"LITERAL2\",\"text\":\"log10\"},{\"tag\":\"LITERAL2\",\"text\":\"log2\"},{\"tag\":\"LITERAL2\",\"text\":\"max\"},{\"tag\":\"LITERAL2\",\"text\":\"min\"},{\"tag\":\"LITERAL2\",\"text\":\"modf\"},{\"tag\":\"LITERAL2\",\"text\":\"mul\"},{\"tag\":\"LITERAL2\",\"text\":\"noise\"},{\"tag\":\"LITERAL2\",\"text\":\"normalize\"},{\"tag\":\"LITERAL2\",\"text\":\"pow\"},{\"tag\":\"LITERAL2\",\"text\":\"radians\"},{\"tag\":\"LITERAL2\",\"text\":\"reflect\"},{\"tag\":\"LITERAL2\",\"text\":\"refract\"},{\"tag\":\"LITERAL2\",\"text\":\"round\"},{\"tag\":\"LITERAL2\",\"text\":\"rsqrt\"},{\"tag\":\"LITERAL2\",\"text\":\"saturate\"},{\"tag\":\"LITERAL2\",\"text\":\"sign\"},{\"tag\":\"LITERAL2\",\"text\":\"sin\"},{\"tag\":\"LITERAL2\",\"text\":\"sincos\"},{\"tag\":\"LITERAL2\",\"text\":\"sinh\"},{\"tag\":\"LITERAL2\",\"text\":\"smoothstep\"},{\"tag\":\"LITERAL2\",\"text\":\"sqrt\"},{\"tag\":\"LITERAL2\",\"text\":\"step\"},{\"tag\":\"LITERAL2\",\"text\":\"tan\"},{\"tag\":\"LITERAL2\",\"text\":\"tanh\"},{\"tag\":\"LITERAL2\",\"text\":\"transpose\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1D\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1Dgrad\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1Dbias\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1Dgrad\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1Dlod\"},{\"tag\":\"LITERAL3\",\"text\":\"tex1Dproj\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2D\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2D\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2Dbias\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2Dgrad\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2Dlod\"},{\"tag\":\"LITERAL3\",\"text\":\"tex2Dproj\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3D\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3D\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3Dbias\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3Dgrad\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3Dlod\"},{\"tag\":\"LITERAL3\",\"text\":\"tex3Dproj\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBE\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBE\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBEbias\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBEgrad\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBElod\"},{\"tag\":\"LITERAL3\",\"text\":\"texCUBEproj\"},{\"tag\":\"INVALID\",\"text\":\"auto\"},{\"tag\":\"INVALID\",\"text\":\"break\"},{\"tag\":\"INVALID\",\"text\":\"case\"},{\"tag\":\"INVALID\",\"text\":\"catch\"},{\"tag\":\"INVALID\",\"text\":\"char\"},{\"tag\":\"INVALID\",\"text\":\"class\"},{\"tag\":\"INVALID\",\"text\":\"const_cast\"},{\"tag\":\"INVALID\",\"text\":\"continue\"},{\"tag\":\"INVALID\",\"text\":\"default\"},{\"tag\":\"INVALID\",\"text\":\"delete\"},{\"tag\":\"INVALID\",\"text\":\"dynamic_cast\"},{\"tag\":\"INVALID\",\"text\":\"enum\"},{\"tag\":\"INVALID\",\"text\":\"explicit\"},{\"tag\":\"INVALID\",\"text\":\"friend\"},{\"tag\":\"INVALID\",\"text\":\"goto\"},{\"tag\":\"INVALID\",\"text\":\"long\"},{\"tag\":\"INVALID\",\"text\":\"mutable\"},{\"tag\":\"INVALID\",\"text\":\"namespace\"},{\"tag\":\"INVALID\",\"text\":\"new\"},{\"tag\":\"INVALID\",\"text\":\"operator\"},{\"tag\":\"INVALID\",\"text\":\"private\"},{\"tag\":\"INVALID\",\"text\":\"protected\"},{\"tag\":\"INVALID\",\"text\":\"public\"},{\"tag\":\"INVALID\",\"text\":\"reinterpret_cast\"},{\"tag\":\"INVALID\",\"text\":\"short\"},{\"tag\":\"INVALID\",\"text\":\"signed\"},{\"tag\":\"INVALID\",\"text\":\"sizeof\"},{\"tag\":\"INVALID\",\"text\":\"static_cast\"},{\"tag\":\"INVALID\",\"text\":\"switch\"},{\"tag\":\"INVALID\",\"text\":\"template\"},{\"tag\":\"INVALID\",\"text\":\"this\"},{\"tag\":\"INVALID\",\"text\":\"throw\"},{\"tag\":\"INVALID\",\"text\":\"try\"},{\"tag\":\"INVALID\",\"text\":\"typename\"},{\"tag\":\"INVALID\",\"text\":\"union\"},{\"tag\":\"INVALID\",\"text\":\"unsigned\"},{\"tag\":\"INVALID\",\"text\":\"using\"},{\"tag\":\"INVALID\",\"text\":\"virtual\"}]}]},{\"tag\":\"RULES\",\"attrs\":{\"SET\":\"Include\",\"DEFAULT\":\"KEYWORD2\"}},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"Preprocessor\",\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DEFAULT\":\"KEYWORD2\",\"DIGIT_RE\":\"((0x[[:xdigit:]]+|[[:digit:]]+)[uUIL]?|[[:digit:]]+([eE][[:digit:]]*)?[hHfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"include\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"Include\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"MARKUP\",\"text\":\"define\"},{\"tag\":\"MARKUP\",\"text\":\"elif\"},{\"tag\":\"MARKUP\",\"text\":\"else\"},{\"tag\":\"MARKUP\",\"text\":\"endif\"},{\"tag\":\"MARKUP\",\"text\":\"error\"},{\"tag\":\"MARKUP\",\"text\":\"if\"},{\"tag\":\"MARKUP\",\"text\":\"ifdef\"},{\"tag\":\"MARKUP\",\"text\":\"ifndef\"},{\"tag\":\"MARKUP\",\"text\":\"line\"},{\"tag\":\"MARKUP\",\"text\":\"pragma\"},{\"tag\":\"MARKUP\",\"text\":\"undef\"},{\"tag\":\"LITERAL1\",\"text\":\"pack_matrix\"},{\"tag\":\"LITERAL1\",\"text\":\"warning\"},{\"tag\":\"LITERAL1\",\"text\":\"def\"},{\"tag\":\"LITERAL1\",\"text\":\"defined\"},{\"tag\":\"LITERAL1\",\"text\":\"D3DX\"},{\"tag\":\"LITERAL1\",\"text\":\"D3DX_VERSION\"},{\"tag\":\"LITERAL1\",\"text\":\"DIRECT3D\"},{\"tag\":\"LITERAL1\",\"text\":\"DIRECT3D_VERSION\"},{\"tag\":\"LITERAL1\",\"text\":\"__FILE__\"},{\"tag\":\"LITERAL1\",\"text\":\"__LINE__\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"Asm\",\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DEFAULT\":\"NULL\",\"DIGIT_RE\":\"((0x[[:xdigit:]]+|[[:digit:]]+)[uUIL]?|[[:digit:]]+([eE][[:digit:]]*)?[hHfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\";\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\",\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\".(([xyzw]{1,4}))\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\".\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"abs(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"abs\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"add(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"add\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"bem(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"bem\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"break_comp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"break_comp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"breakp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"breakp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"callnz(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"callnz\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"cmp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"cmp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"cnd(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"cnd\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"crs(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"crs\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dp2add(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dp2add\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dp3(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dp3\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dp4(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dp4\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dst(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dst\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dsx(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dsx\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dsy(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"dsy\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"else(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"else\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"endif(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"endif\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"endloop(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"endloop\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"endrep(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"endrep\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"exp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"exp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"frc(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"frc\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"if(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"if\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"label(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"label\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"lit(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"lit\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"logp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"logp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"loop(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"loop\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"lrp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"lrp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"m3x2(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"m3x2\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"m3x3(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"m3x3\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"m3x4(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"m3x4\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"m4x3(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"m4x3\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"m4x4(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"m4x4\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"mad(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"mad\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"mov(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"mov\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"max(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"max\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"min(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"min\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"mova(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"mova\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"mul(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"mul\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"nop(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"nop\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"nrm(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"nrm\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"phase(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"phase\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"pow(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"pow\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"rcp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"rcp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"rep(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"rep\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"ret(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"ret\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"rsq(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"rsq\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"setp_comp(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"setp_comp\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"sge(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"sge\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"sgn(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"sgn\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"sincos(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"sincos\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"slt(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"slt\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"sub(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"sub\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"neg(_pp|_sat|_x2|_x4|_x8|_bx2|_d2|_d4|_d8)*\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"FUNCTION\",\"HASH_CHAR\":\"neg\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"tex\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD2\",\"HASH_CHAR\":\"tex\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"ps\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"ps\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"vs\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"vs\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"def\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"def\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"dcl\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD1\",\"HASH_CHAR\":\"dcl\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\"}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
