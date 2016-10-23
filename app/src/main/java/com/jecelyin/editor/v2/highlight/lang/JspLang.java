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
public class JspLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"<%--\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"--%>\",\"NAME\":\"commentEnd\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%--\"},{\"tag\":\"END\",\"text\":\"--%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"DIRECTIVES\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%@\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"DIRECTIVES\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<jsp:directive>\"},{\"tag\":\"END\",\"text\":\"<\\/jsp:directive>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<jsp:expression>\"},{\"tag\":\"END\",\"text\":\"<\\/jsp:expression>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%!\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<jsp:declaration>\"},{\"tag\":\"END\",\"text\":\"<\\/jsp:declaration>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"JAVA\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<jsp:scriptlet>\"},{\"tag\":\"END\",\"text\":\"<\\/jsp:scriptlet>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"DELEGATE\":\"COMMENT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"html::JAVASCRIPT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<SCRIPT\"},{\"tag\":\"END\",\"text\":\"<\\/SCRIPT>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"html::CSS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<STYLE\"},{\"tag\":\"END\",\"text\":\"<\\/STYLE>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"xml::DTD-TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"&\"},{\"tag\":\"END\",\"text\":\";\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"EL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"COMMENT\",\"DEFAULT\":\"COMMENT1\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%--\"},{\"tag\":\"END\",\"text\":\"--%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%\"},{\"tag\":\"END\",\"text\":\"%>\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DIRECTIVES\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"ATTRVALUE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"ATTRVALUE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"MARKUP\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"taglib\"},{\"tag\":\"KEYWORD1\",\"text\":\"include\"},{\"tag\":\"KEYWORD1\",\"text\":\"page\"},{\"tag\":\"KEYWORD1\",\"text\":\"tag\"},{\"tag\":\"KEYWORD1\",\"text\":\"tagAttribute\"},{\"tag\":\"KEYWORD1\",\"text\":\"tagVariable\"},{\"tag\":\"KEYWORD2\",\"text\":\"language\"},{\"tag\":\"KEYWORD2\",\"text\":\"session\"},{\"tag\":\"KEYWORD2\",\"text\":\"contentType\"},{\"tag\":\"KEYWORD2\",\"text\":\"charset\"},{\"tag\":\"KEYWORD2\",\"text\":\"import\"},{\"tag\":\"KEYWORD2\",\"text\":\"buffer\"},{\"tag\":\"KEYWORD2\",\"text\":\"autoflush\"},{\"tag\":\"KEYWORD2\",\"text\":\"isThreadSafe\"},{\"tag\":\"KEYWORD2\",\"text\":\"info\"},{\"tag\":\"KEYWORD2\",\"text\":\"errorPage\"},{\"tag\":\"KEYWORD2\",\"text\":\"isErrorpage\"},{\"tag\":\"KEYWORD2\",\"text\":\"extends\"},{\"tag\":\"KEYWORD2\",\"text\":\"file\"},{\"tag\":\"KEYWORD2\",\"text\":\"uri\"},{\"tag\":\"KEYWORD2\",\"text\":\"prefix\"},{\"tag\":\"KEYWORD2\",\"text\":\"method\"},{\"tag\":\"KEYWORD2\",\"text\":\"name\"},{\"tag\":\"KEYWORD2\",\"text\":\"default\"},{\"tag\":\"KEYWORD2\",\"text\":\"required\"},{\"tag\":\"KEYWORD2\",\"text\":\"rtexprvalue\"},{\"tag\":\"KEYWORD2\",\"text\":\"id\"},{\"tag\":\"KEYWORD2\",\"text\":\"type\"},{\"tag\":\"KEYWORD2\",\"text\":\"scope\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TAGS\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%--\"},{\"tag\":\"END\",\"text\":\"--%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"CSS+JSP\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"style='\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"CSS+JSP\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"style=\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"ATTRVALUE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"ATTRVALUE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"MARKUP\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\":\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"html::TAGS\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"CSS+JSP\",\"DEFAULT\":\"LITERAL1\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"EL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"css::MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"ATTRVALUE\",\"DEFAULT\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD1\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"EL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SEQ\",\"text\":\"javascript:\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"JAVASCRIPT+JSP\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"JAVASCRIPT+JSP\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"java::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<%=\"},{\"tag\":\"END\",\"text\":\"%>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"EL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"${\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"javascript::MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"EL\",\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0[lL]?|[1-9]\\\\d{0,9}(\\\\d{0,9}[lL])?|0[xX]\\\\p{XDigit}{1,8}(\\\\p{XDigit}{0,8}[lL])?|0[0-7]{1,11}([0-7]{0,11}[lL])?|([0-9]+\\\\.[0-9]*|\\\\.[0-9]+)([eE][+-]?[0-9]+)?[fFdD]?|[0-9]+([eE][+-]?[0-9]+[fFdD]?|([eE][+-]?[0-9]+)?[fFdD]))\"},\"child\":[{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"java::MAIN\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"JAVA\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"[/][/](.*?)(?=[%][>])\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"java::MAIN\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
