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
public class XslLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"<!--\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"-->\",\"NAME\":\"commentEnd\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"FALSE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\",\"DELEGATE\":\"TASKS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XSLTAGS\",\"HASH_CHAR\":\"<\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<(?=xsl:)\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XSLTAGS\",\"HASH_CHAR\":\"<\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<(?=/xsl:)\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"xml::CDATA\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<![CDATA[\"},{\"tag\":\"END\",\"text\":\"]]>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"xml::DTD-TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"&\"},{\"tag\":\"END\",\"text\":\";\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<?\"},{\"tag\":\"END\",\"text\":\"?>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<\"},{\"tag\":\"END\",\"text\":\">\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TASKS\",\"DEFAULT\":\"COMMENT1\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"COMMENT4\",\"text\":\"DEBUG:\"},{\"tag\":\"COMMENT4\",\"text\":\"DONE:\"},{\"tag\":\"COMMENT4\",\"text\":\"FIXME:\"},{\"tag\":\"COMMENT4\",\"text\":\"IDEA:\"},{\"tag\":\"COMMENT4\",\"text\":\"NOTE:\"},{\"tag\":\"COMMENT4\",\"text\":\"QUESTION:\"},{\"tag\":\"COMMENT4\",\"text\":\"TODO:\"},{\"tag\":\"COMMENT4\",\"text\":\"XXX\"},{\"tag\":\"COMMENT4\",\"text\":\"???\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TAGS\",\"HIGHLIGHT_DIGITS\":\"FALSE\",\"DEFAULT\":\"MARKUP\",\"NO_WORD_SEP\":\".-_:\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"AVT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"AVT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"xmlns:\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"xmlns\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"AVT\",\"HIGHLIGHT_DIGITS\":\"FALSE\",\"DEFAULT\":\"KEYWORD3\",\"NO_WORD_SEP\":\".-_:\"},\"child\":[{\"tag\":\"SEQ\",\"text\":\"{{\"},{\"tag\":\"SEQ\",\"text\":\"}}\"},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"XPATH\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"&\"},{\"tag\":\"END\",\"text\":\";\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"XSLTAGS\",\"HIGHLIGHT_DIGITS\":\"FALSE\",\"DEFAULT\":\"KEYWORD2\",\"NO_WORD_SEP\":\".-_:\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"AVT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"AVT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"count\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"count[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"count\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"count[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"from\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"from[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"from\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"from[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-adjacent\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-adjacent[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-adjacent\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-adjacent[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-by\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-by[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-by\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-by[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-ending-with\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-ending-with[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-ending-with\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-ending-with[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-starting-with\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-starting-with[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"group-starting-with\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"group-starting-with[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"match\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"match[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"match\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"match[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"select\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"select[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"select\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"select[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"test\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"test[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"test\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"test[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"use\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"use[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"use\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"use[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"value\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"value[\\\\p{Space}]*=[\\\\p{Space}]*\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"XPATH\",\"HASH_CHAR\":\"select\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"select[\\\\p{Space}]*=[\\\\p{Space}]*'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"xmlns:\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"xmlns\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"analyze-string\"},{\"tag\":\"KEYWORD1\",\"text\":\"apply-imports\"},{\"tag\":\"KEYWORD1\",\"text\":\"apply-templates\"},{\"tag\":\"KEYWORD1\",\"text\":\"attribute\"},{\"tag\":\"KEYWORD1\",\"text\":\"attribute-set\"},{\"tag\":\"KEYWORD1\",\"text\":\"call-template\"},{\"tag\":\"KEYWORD1\",\"text\":\"character-map\"},{\"tag\":\"KEYWORD1\",\"text\":\"choose\"},{\"tag\":\"KEYWORD1\",\"text\":\"comment\"},{\"tag\":\"KEYWORD1\",\"text\":\"copy\"},{\"tag\":\"KEYWORD1\",\"text\":\"copy-of\"},{\"tag\":\"KEYWORD1\",\"text\":\"decimal-format\"},{\"tag\":\"KEYWORD1\",\"text\":\"document\"},{\"tag\":\"KEYWORD1\",\"text\":\"element\"},{\"tag\":\"KEYWORD1\",\"text\":\"fallback\"},{\"tag\":\"KEYWORD1\",\"text\":\"for-each\"},{\"tag\":\"KEYWORD1\",\"text\":\"for-each-group\"},{\"tag\":\"KEYWORD1\",\"text\":\"function\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"import\"},{\"tag\":\"KEYWORD1\",\"text\":\"import-schema\"},{\"tag\":\"KEYWORD1\",\"text\":\"include\"},{\"tag\":\"KEYWORD1\",\"text\":\"key\"},{\"tag\":\"KEYWORD1\",\"text\":\"matching-substring\"},{\"tag\":\"KEYWORD1\",\"text\":\"message\"},{\"tag\":\"KEYWORD1\",\"text\":\"namespace\"},{\"tag\":\"KEYWORD1\",\"text\":\"namespace-alias\"},{\"tag\":\"KEYWORD1\",\"text\":\"next-match\"},{\"tag\":\"KEYWORD1\",\"text\":\"non-matching-substring\"},{\"tag\":\"KEYWORD1\",\"text\":\"number\"},{\"tag\":\"KEYWORD1\",\"text\":\"otherwise\"},{\"tag\":\"KEYWORD1\",\"text\":\"output\"},{\"tag\":\"KEYWORD1\",\"text\":\"output-character\"},{\"tag\":\"KEYWORD1\",\"text\":\"param\"},{\"tag\":\"KEYWORD1\",\"text\":\"perform-sort\"},{\"tag\":\"KEYWORD1\",\"text\":\"preserve-space\"},{\"tag\":\"KEYWORD1\",\"text\":\"processing-instruction\"},{\"tag\":\"KEYWORD1\",\"text\":\"result-document\"},{\"tag\":\"KEYWORD1\",\"text\":\"sequence\"},{\"tag\":\"KEYWORD1\",\"text\":\"sort\"},{\"tag\":\"KEYWORD1\",\"text\":\"strip-space\"},{\"tag\":\"KEYWORD1\",\"text\":\"stylesheet\"},{\"tag\":\"KEYWORD1\",\"text\":\"template\"},{\"tag\":\"KEYWORD1\",\"text\":\"text\"},{\"tag\":\"KEYWORD1\",\"text\":\"transform\"},{\"tag\":\"KEYWORD1\",\"text\":\"value-of\"},{\"tag\":\"KEYWORD1\",\"text\":\"variable\"},{\"tag\":\"KEYWORD1\",\"text\":\"when\"},{\"tag\":\"KEYWORD1\",\"text\":\"with-param\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"XPATH\",\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DEFAULT\":\"KEYWORD3\",\"DIGIT_RE\":\"[\\\\p{Digit}]+([\\\\p{Punct}][\\\\p{Digit}]+)?\",\"NO_WORD_SEP\":\".-_\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\",\"DELEGATE\":\"XPATHCOMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(:\"},{\"tag\":\"END\",\"text\":\":)\"}]},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"::\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SEQ\",\"text\":\"@\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&gt;\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&lt;\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"?\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\",\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"OPERATOR\",\"DELEGATE\":\"XPATH\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"[\"},{\"tag\":\"END\",\"text\":\"]\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"&\"},{\"tag\":\"END\",\"text\":\";\"}]},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"$\",\"attrs\":{\"TYPE\":\"LITERAL2\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"OPERATOR\",\"text\":\"and\"},{\"tag\":\"OPERATOR\",\"text\":\"as\"},{\"tag\":\"OPERATOR\",\"text\":\"castable\"},{\"tag\":\"OPERATOR\",\"text\":\"div\"},{\"tag\":\"OPERATOR\",\"text\":\"else\"},{\"tag\":\"OPERATOR\",\"text\":\"eq\"},{\"tag\":\"OPERATOR\",\"text\":\"every\"},{\"tag\":\"OPERATOR\",\"text\":\"except\"},{\"tag\":\"OPERATOR\",\"text\":\"for\"},{\"tag\":\"OPERATOR\",\"text\":\"ge\"},{\"tag\":\"OPERATOR\",\"text\":\"gt\"},{\"tag\":\"OPERATOR\",\"text\":\"idiv\"},{\"tag\":\"OPERATOR\",\"text\":\"if\"},{\"tag\":\"OPERATOR\",\"text\":\"in\"},{\"tag\":\"OPERATOR\",\"text\":\"instance\"},{\"tag\":\"OPERATOR\",\"text\":\"intersect\"},{\"tag\":\"OPERATOR\",\"text\":\"is\"},{\"tag\":\"OPERATOR\",\"text\":\"isnot\"},{\"tag\":\"OPERATOR\",\"text\":\"le\"},{\"tag\":\"OPERATOR\",\"text\":\"lt\"},{\"tag\":\"OPERATOR\",\"text\":\"mod\"},{\"tag\":\"OPERATOR\",\"text\":\"nillable\"},{\"tag\":\"OPERATOR\",\"text\":\"ne\"},{\"tag\":\"OPERATOR\",\"text\":\"of\"},{\"tag\":\"OPERATOR\",\"text\":\"or\"},{\"tag\":\"OPERATOR\",\"text\":\"return\"},{\"tag\":\"OPERATOR\",\"text\":\"satisfies\"},{\"tag\":\"OPERATOR\",\"text\":\"some\"},{\"tag\":\"OPERATOR\",\"text\":\"then\"},{\"tag\":\"OPERATOR\",\"text\":\"to\"},{\"tag\":\"OPERATOR\",\"text\":\"treat\"},{\"tag\":\"OPERATOR\",\"text\":\"union\"},{\"tag\":\"OPERATOR\",\"text\":\"-\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"XPATHCOMMENT2\",\"DEFAULT\":\"COMMENT2\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT3\",\"DELEGATE\":\"XPATHCOMMENT3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(:\"},{\"tag\":\"END\",\"text\":\":)\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"XPATHCOMMENT3\",\"DEFAULT\":\"COMMENT3\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\",\"DELEGATE\":\"XPATHCOMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"(:\"},{\"tag\":\"END\",\"text\":\":)\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
