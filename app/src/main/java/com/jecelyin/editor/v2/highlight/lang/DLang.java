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
public class DLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"(\",\"NAME\":\"unalignedOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\")\",\"NAME\":\"unalignedCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(((if|while)\\\\s*\\\\(|else\\\\s*|else\\\\s+if\\\\s*\\\\(|for\\\\s*\\\\(.*\\\\))[^{;]*)\",\"NAME\":\"indentNextLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"^.*(default:\\\\s*|case.*:.*)$\",\"NAME\":\"unindentThisLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\":\",\"NAME\":\"electricKeys\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x[0-9a-fA-F_]+[uUlL]?|[0-9_]+(e[0-9_]*)?[uUlLdDfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"/**/\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\",\"DELEGATE\":\"doxygen::DOXYGEN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/**\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\",\"DELEGATE\":\"doxygen::DOXYGEN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*!\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"DELEGATE\":\"NESTED_COMMENT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/+\"},{\"tag\":\"END\",\"text\":\"+/\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"r\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"`\"},{\"tag\":\"END\",\"text\":\"`\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"x\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"@\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"abstract\"},{\"tag\":\"KEYWORD4\",\"text\":\"alias\"},{\"tag\":\"KEYWORD4\",\"text\":\"align\"},{\"tag\":\"KEYWORD4\",\"text\":\"asm\"},{\"tag\":\"KEYWORD4\",\"text\":\"assert\"},{\"tag\":\"KEYWORD3\",\"text\":\"auto\"},{\"tag\":\"KEYWORD1\",\"text\":\"body\"},{\"tag\":\"KEYWORD3\",\"text\":\"bool\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD3\",\"text\":\"byte\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD4\",\"text\":\"cast\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD3\",\"text\":\"cdouble\"},{\"tag\":\"KEYWORD3\",\"text\":\"cent\"},{\"tag\":\"KEYWORD3\",\"text\":\"cfloat\"},{\"tag\":\"KEYWORD3\",\"text\":\"char\"},{\"tag\":\"KEYWORD1\",\"text\":\"class\"},{\"tag\":\"KEYWORD2\",\"text\":\"const\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD3\",\"text\":\"creal\"},{\"tag\":\"KEYWORD3\",\"text\":\"dchar\"},{\"tag\":\"KEYWORD1\",\"text\":\"debug\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD4\",\"text\":\"delegate\"},{\"tag\":\"KEYWORD4\",\"text\":\"delete\"},{\"tag\":\"KEYWORD2\",\"text\":\"deprecated\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD3\",\"text\":\"double\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD3\",\"text\":\"enum\"},{\"tag\":\"KEYWORD4\",\"text\":\"export\"},{\"tag\":\"KEYWORD2\",\"text\":\"extern\"},{\"tag\":\"LITERAL1\",\"text\":\"false\"},{\"tag\":\"KEYWORD2\",\"text\":\"final\"},{\"tag\":\"KEYWORD1\",\"text\":\"finally\"},{\"tag\":\"KEYWORD3\",\"text\":\"float\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"foreach\"},{\"tag\":\"KEYWORD1\",\"text\":\"foreach_reverse\"},{\"tag\":\"KEYWORD4\",\"text\":\"function\"},{\"tag\":\"KEYWORD1\",\"text\":\"goto\"},{\"tag\":\"KEYWORD3\",\"text\":\"idouble\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD3\",\"text\":\"ifloat\"},{\"tag\":\"KEYWORD2\",\"text\":\"immutable\"},{\"tag\":\"KEYWORD4\",\"text\":\"import\"},{\"tag\":\"KEYWORD2\",\"text\":\"in\"},{\"tag\":\"KEYWORD2\",\"text\":\"inout\"},{\"tag\":\"KEYWORD3\",\"text\":\"int\"},{\"tag\":\"KEYWORD3\",\"text\":\"interface\"},{\"tag\":\"KEYWORD4\",\"text\":\"invariant\"},{\"tag\":\"KEYWORD3\",\"text\":\"ireal\"},{\"tag\":\"KEYWORD4\",\"text\":\"is\"},{\"tag\":\"KEYWORD2\",\"text\":\"lazy\"},{\"tag\":\"KEYWORD3\",\"text\":\"long\"},{\"tag\":\"INVALID\",\"text\":\"macro\"},{\"tag\":\"KEYWORD4\",\"text\":\"mixin\"},{\"tag\":\"KEYWORD4\",\"text\":\"module\"},{\"tag\":\"KEYWORD4\",\"text\":\"new\"},{\"tag\":\"KEYWORD2\",\"text\":\"nothrow\"},{\"tag\":\"LITERAL1\",\"text\":\"null\"},{\"tag\":\"KEYWORD2\",\"text\":\"out\"},{\"tag\":\"KEYWORD2\",\"text\":\"override\"},{\"tag\":\"KEYWORD4\",\"text\":\"package\"},{\"tag\":\"KEYWORD4\",\"text\":\"pragma\"},{\"tag\":\"KEYWORD2\",\"text\":\"private\"},{\"tag\":\"KEYWORD2\",\"text\":\"protected\"},{\"tag\":\"KEYWORD2\",\"text\":\"public\"},{\"tag\":\"KEYWORD2\",\"text\":\"pure\"},{\"tag\":\"KEYWORD3\",\"text\":\"real\"},{\"tag\":\"KEYWORD2\",\"text\":\"ref\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"scope\"},{\"tag\":\"KEYWORD2\",\"text\":\"shared\"},{\"tag\":\"KEYWORD3\",\"text\":\"short\"},{\"tag\":\"KEYWORD2\",\"text\":\"static\"},{\"tag\":\"KEYWORD3\",\"text\":\"struct\"},{\"tag\":\"KEYWORD4\",\"text\":\"super\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD2\",\"text\":\"synchronized\"},{\"tag\":\"KEYWORD4\",\"text\":\"template\"},{\"tag\":\"LITERAL1\",\"text\":\"this\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw\"},{\"tag\":\"LITERAL1\",\"text\":\"true\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD4\",\"text\":\"typedef\"},{\"tag\":\"KEYWORD4\",\"text\":\"typeid\"},{\"tag\":\"KEYWORD4\",\"text\":\"typeof\"},{\"tag\":\"KEYWORD3\",\"text\":\"ubyte\"},{\"tag\":\"KEYWORD3\",\"text\":\"ucent\"},{\"tag\":\"KEYWORD3\",\"text\":\"uint\"},{\"tag\":\"KEYWORD3\",\"text\":\"ulong\"},{\"tag\":\"KEYWORD3\",\"text\":\"union\"},{\"tag\":\"KEYWORD1\",\"text\":\"unittest\"},{\"tag\":\"KEYWORD3\",\"text\":\"ushort\"},{\"tag\":\"KEYWORD1\",\"text\":\"version\"},{\"tag\":\"KEYWORD3\",\"text\":\"void\"},{\"tag\":\"KEYWORD2\",\"text\":\"volatile\"},{\"tag\":\"KEYWORD3\",\"text\":\"wchar\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"with\"},{\"tag\":\"KEYWORD1\",\"text\":\"__FILE__\"},{\"tag\":\"KEYWORD1\",\"text\":\"__LINE__\"},{\"tag\":\"KEYWORD2\",\"text\":\"__gshared\"},{\"tag\":\"KEYWORD1\",\"text\":\"__thread\"},{\"tag\":\"KEYWORD1\",\"text\":\"__traits\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"NESTED_COMMENT\",\"DEFAULT\":\"COMMENT1\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"DELEGATE\":\"NESTED_COMMENT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/+\"},{\"tag\":\"END\",\"text\":\"+/\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
