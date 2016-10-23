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
public class TurbobasicLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"'\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"ESCAPE\":\"\\\\\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"'\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"rem\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"MARKUP\",\"HASH_CHAR\":\"%\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"%\"},{\"tag\":\"END\",\"text\":\"\\\\S*\"}]},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"\\\\\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"mod\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"#\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"SEQ\",\"text\":\"def FN\",\"attrs\":{\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"SEQ\",\"text\":\"option base\",\"attrs\":{\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LABEL\",\"AT_LINE_START\":\"TRUE\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD3\",\"text\":\"notalotta\"},{\"tag\":\"KEYWORD3\",\"text\":\"and\"},{\"tag\":\"KEYWORD3\",\"text\":\"eqv\"},{\"tag\":\"KEYWORD3\",\"text\":\"imp\"},{\"tag\":\"KEYWORD3\",\"text\":\"not\"},{\"tag\":\"KEYWORD3\",\"text\":\"or\"},{\"tag\":\"KEYWORD3\",\"text\":\"xor\"},{\"tag\":\"KEYWORD1\",\"text\":\"chain\"},{\"tag\":\"KEYWORD1\",\"text\":\"common\"},{\"tag\":\"KEYWORD1\",\"text\":\"run\"},{\"tag\":\"KEYWORD1\",\"text\":\"dim\"},{\"tag\":\"KEYWORD1\",\"text\":\"lbound\"},{\"tag\":\"KEYWORD1\",\"text\":\"let\"},{\"tag\":\"KEYWORD1\",\"text\":\"local\"},{\"tag\":\"KEYWORD1\",\"text\":\"rem\"},{\"tag\":\"KEYWORD1\",\"text\":\"shared\"},{\"tag\":\"KEYWORD1\",\"text\":\"static\"},{\"tag\":\"KEYWORD1\",\"text\":\"tron\"},{\"tag\":\"KEYWORD1\",\"text\":\"troff\"},{\"tag\":\"KEYWORD1\",\"text\":\"ubound\"},{\"tag\":\"KEYWORD1\",\"text\":\"com\"},{\"tag\":\"KEYWORD1\",\"text\":\"inp\"},{\"tag\":\"KEYWORD1\",\"text\":\"ioctl$\"},{\"tag\":\"KEYWORD1\",\"text\":\"ioctl\"},{\"tag\":\"KEYWORD1\",\"text\":\"out\"},{\"tag\":\"KEYWORD1\",\"text\":\"chdir\"},{\"tag\":\"KEYWORD1\",\"text\":\"command$\"},{\"tag\":\"KEYWORD1\",\"text\":\"date$\"},{\"tag\":\"KEYWORD1\",\"text\":\"environ$\"},{\"tag\":\"KEYWORD1\",\"text\":\"environ\"},{\"tag\":\"KEYWORD1\",\"text\":\"kill\"},{\"tag\":\"KEYWORD1\",\"text\":\"mkdir\"},{\"tag\":\"KEYWORD1\",\"text\":\"rmdir\"},{\"tag\":\"KEYWORD1\",\"text\":\"shell\"},{\"tag\":\"KEYWORD1\",\"text\":\"system\"},{\"tag\":\"KEYWORD1\",\"text\":\"time$\"},{\"tag\":\"KEYWORD1\",\"text\":\"eradr\"},{\"tag\":\"KEYWORD1\",\"text\":\"erdev\"},{\"tag\":\"KEYWORD1\",\"text\":\"erdev$\"},{\"tag\":\"KEYWORD1\",\"text\":\"erl\"},{\"tag\":\"KEYWORD1\",\"text\":\"error\"},{\"tag\":\"KEYWORD1\",\"text\":\"err\"},{\"tag\":\"KEYWORD1\",\"text\":\"bload\"},{\"tag\":\"KEYWORD1\",\"text\":\"bsave\"},{\"tag\":\"KEYWORD1\",\"text\":\"close\"},{\"tag\":\"KEYWORD1\",\"text\":\"eof\"},{\"tag\":\"KEYWORD1\",\"text\":\"field\"},{\"tag\":\"KEYWORD1\",\"text\":\"files\"},{\"tag\":\"KEYWORD1\",\"text\":\"get\"},{\"tag\":\"KEYWORD1\",\"text\":\"loc\"},{\"tag\":\"KEYWORD1\",\"text\":\"lof\"},{\"tag\":\"KEYWORD1\",\"text\":\"lset\"},{\"tag\":\"KEYWORD1\",\"text\":\"name\"},{\"tag\":\"KEYWORD1\",\"text\":\"open\"},{\"tag\":\"KEYWORD1\",\"text\":\"put$\"},{\"tag\":\"KEYWORD1\",\"text\":\"put\"},{\"tag\":\"KEYWORD1\",\"text\":\"reset\"},{\"tag\":\"KEYWORD1\",\"text\":\"rset\"},{\"tag\":\"KEYWORD1\",\"text\":\"seek\"},{\"tag\":\"KEYWORD1\",\"text\":\"using\"},{\"tag\":\"KEYWORD1\",\"text\":\"call\"},{\"tag\":\"KEYWORD1\",\"text\":\"call\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"def\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"elseif\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"end\"},{\"tag\":\"KEYWORD1\",\"text\":\"loop\"},{\"tag\":\"KEYWORD1\",\"text\":\"exit\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"next\"},{\"tag\":\"KEYWORD1\",\"text\":\"gosub\"},{\"tag\":\"KEYWORD1\",\"text\":\"goto\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"inline\"},{\"tag\":\"KEYWORD1\",\"text\":\"resume\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"select\"},{\"tag\":\"KEYWORD1\",\"text\":\"step\"},{\"tag\":\"KEYWORD1\",\"text\":\"stop\"},{\"tag\":\"KEYWORD1\",\"text\":\"sub\"},{\"tag\":\"KEYWORD1\",\"text\":\"then\"},{\"tag\":\"KEYWORD1\",\"text\":\"to\"},{\"tag\":\"KEYWORD1\",\"text\":\"until\"},{\"tag\":\"KEYWORD1\",\"text\":\"wend\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"circle\"},{\"tag\":\"KEYWORD1\",\"text\":\"draw\"},{\"tag\":\"KEYWORD1\",\"text\":\"line\"},{\"tag\":\"KEYWORD1\",\"text\":\"paint\"},{\"tag\":\"KEYWORD1\",\"text\":\"palette\"},{\"tag\":\"KEYWORD1\",\"text\":\"peek\"},{\"tag\":\"KEYWORD1\",\"text\":\"pen\"},{\"tag\":\"KEYWORD1\",\"text\":\"pmap\"},{\"tag\":\"KEYWORD1\",\"text\":\"point\"},{\"tag\":\"KEYWORD1\",\"text\":\"poke\"},{\"tag\":\"KEYWORD1\",\"text\":\"preset\"},{\"tag\":\"KEYWORD1\",\"text\":\"pset\"},{\"tag\":\"KEYWORD1\",\"text\":\"put\"},{\"tag\":\"KEYWORD1\",\"text\":\"view\"},{\"tag\":\"KEYWORD1\",\"text\":\"window\"},{\"tag\":\"KEYWORD1\",\"text\":\"mtimer\"},{\"tag\":\"KEYWORD1\",\"text\":\"off\"},{\"tag\":\"KEYWORD1\",\"text\":\"on\"},{\"tag\":\"KEYWORD1\",\"text\":\"stick\"},{\"tag\":\"KEYWORD1\",\"text\":\"strig\"},{\"tag\":\"KEYWORD1\",\"text\":\"timer\"},{\"tag\":\"KEYWORD1\",\"text\":\"wait\"},{\"tag\":\"KEYWORD1\",\"text\":\"inkey$\"},{\"tag\":\"KEYWORD1\",\"text\":\"input$\"},{\"tag\":\"KEYWORD1\",\"text\":\"input\"},{\"tag\":\"KEYWORD1\",\"text\":\"instat\"},{\"tag\":\"KEYWORD1\",\"text\":\"read\"},{\"tag\":\"KEYWORD1\",\"text\":\"restore\"},{\"tag\":\"KEYWORD1\",\"text\":\"key\"},{\"tag\":\"KEYWORD1\",\"text\":\"clear\"},{\"tag\":\"KEYWORD1\",\"text\":\"endmem\"},{\"tag\":\"KEYWORD1\",\"text\":\"erase\"},{\"tag\":\"KEYWORD1\",\"text\":\"fre\"},{\"tag\":\"KEYWORD1\",\"text\":\"memset\"},{\"tag\":\"KEYWORD1\",\"text\":\"poke\"},{\"tag\":\"KEYWORD1\",\"text\":\"seg\"},{\"tag\":\"KEYWORD1\",\"text\":\"varptr$\"},{\"tag\":\"KEYWORD1\",\"text\":\"varptr\"},{\"tag\":\"KEYWORD1\",\"text\":\"varseg\"},{\"tag\":\"KEYWORD2\",\"text\":\"$com1\"},{\"tag\":\"KEYWORD2\",\"text\":\"$com2\"},{\"tag\":\"KEYWORD2\",\"text\":\"$com\"},{\"tag\":\"KEYWORD2\",\"text\":\"$debug\"},{\"tag\":\"KEYWORD2\",\"text\":\"$dynamic\"},{\"tag\":\"KEYWORD2\",\"text\":\"$event\"},{\"tag\":\"KEYWORD2\",\"text\":\"$if\"},{\"tag\":\"KEYWORD2\",\"text\":\"$else\"},{\"tag\":\"KEYWORD2\",\"text\":\"$endif\"},{\"tag\":\"KEYWORD2\",\"text\":\"$include\"},{\"tag\":\"KEYWORD2\",\"text\":\"$inline\"},{\"tag\":\"KEYWORD2\",\"text\":\"$list\"},{\"tag\":\"KEYWORD2\",\"text\":\"$option\"},{\"tag\":\"KEYWORD2\",\"text\":\"$segment\"},{\"tag\":\"KEYWORD2\",\"text\":\"$sound\"},{\"tag\":\"KEYWORD2\",\"text\":\"$stack\"},{\"tag\":\"KEYWORD2\",\"text\":\"$static\"},{\"tag\":\"KEYWORD1\",\"text\":\"data\"},{\"tag\":\"KEYWORD1\",\"text\":\"delay\"},{\"tag\":\"KEYWORD1\",\"text\":\"reg\"},{\"tag\":\"KEYWORD1\",\"text\":\"swap\"},{\"tag\":\"FUNCTION\",\"text\":\"abs\"},{\"tag\":\"FUNCTION\",\"text\":\"asc\"},{\"tag\":\"FUNCTION\",\"text\":\"atn\"},{\"tag\":\"FUNCTION\",\"text\":\"cdbl\"},{\"tag\":\"FUNCTION\",\"text\":\"ceil\"},{\"tag\":\"FUNCTION\",\"text\":\"cint\"},{\"tag\":\"FUNCTION\",\"text\":\"clng\"},{\"tag\":\"FUNCTION\",\"text\":\"cos\"},{\"tag\":\"FUNCTION\",\"text\":\"csng\"},{\"tag\":\"FUNCTION\",\"text\":\"cvi\"},{\"tag\":\"FUNCTION\",\"text\":\"cvl\"},{\"tag\":\"FUNCTION\",\"text\":\"cvs\"},{\"tag\":\"FUNCTION\",\"text\":\"cvd\"},{\"tag\":\"FUNCTION\",\"text\":\"cvmd\"},{\"tag\":\"FUNCTION\",\"text\":\"cvms\"},{\"tag\":\"KEYWORD2\",\"text\":\"decr\"},{\"tag\":\"KEYWORD2\",\"text\":\"defint\"},{\"tag\":\"KEYWORD2\",\"text\":\"deflng\"},{\"tag\":\"KEYWORD2\",\"text\":\"defsng\"},{\"tag\":\"KEYWORD2\",\"text\":\"defdbl\"},{\"tag\":\"KEYWORD2\",\"text\":\"defstr\"},{\"tag\":\"FUNCTION\",\"text\":\"exp2\"},{\"tag\":\"FUNCTION\",\"text\":\"exp10\"},{\"tag\":\"FUNCTION\",\"text\":\"exp\"},{\"tag\":\"FUNCTION\",\"text\":\"fix\"},{\"tag\":\"KEYWORD2\",\"text\":\"incr\"},{\"tag\":\"FUNCTION\",\"text\":\"int\"},{\"tag\":\"FUNCTION\",\"text\":\"log10\"},{\"tag\":\"FUNCTION\",\"text\":\"log2\"},{\"tag\":\"FUNCTION\",\"text\":\"log\"},{\"tag\":\"FUNCTION\",\"text\":\"mki$\"},{\"tag\":\"FUNCTION\",\"text\":\"mkl$\"},{\"tag\":\"FUNCTION\",\"text\":\"mks$\"},{\"tag\":\"FUNCTION\",\"text\":\"mkd$\"},{\"tag\":\"FUNCTION\",\"text\":\"mkmd$\"},{\"tag\":\"FUNCTION\",\"text\":\"mkms$\"},{\"tag\":\"KEYWORD2\",\"text\":\"randomize\"},{\"tag\":\"KEYWORD2\",\"text\":\"random\"},{\"tag\":\"FUNCTION\",\"text\":\"rnd\"},{\"tag\":\"FUNCTION\",\"text\":\"sgn\"},{\"tag\":\"FUNCTION\",\"text\":\"sin\"},{\"tag\":\"FUNCTION\",\"text\":\"spc\"},{\"tag\":\"FUNCTION\",\"text\":\"sqr\"},{\"tag\":\"FUNCTION\",\"text\":\"tab\"},{\"tag\":\"FUNCTION\",\"text\":\"tan\"},{\"tag\":\"KEYWORD1\",\"text\":\"print\"},{\"tag\":\"KEYWORD1\",\"text\":\"write\"},{\"tag\":\"KEYWORD1\",\"text\":\"lpos\"},{\"tag\":\"KEYWORD1\",\"text\":\"lprint\"},{\"tag\":\"KEYWORD1\",\"text\":\"cls\"},{\"tag\":\"KEYWORD1\",\"text\":\"color\"},{\"tag\":\"KEYWORD1\",\"text\":\"csrlin\"},{\"tag\":\"KEYWORD1\",\"text\":\"locate\"},{\"tag\":\"KEYWORD1\",\"text\":\"pos\"},{\"tag\":\"KEYWORD1\",\"text\":\"screen\"},{\"tag\":\"KEYWORD1\",\"text\":\"width\"},{\"tag\":\"KEYWORD1\",\"text\":\"beep\"},{\"tag\":\"KEYWORD1\",\"text\":\"play\"},{\"tag\":\"KEYWORD1\",\"text\":\"sound\"},{\"tag\":\"FUNCTION\",\"text\":\"bin$\"},{\"tag\":\"FUNCTION\",\"text\":\"chr$\"},{\"tag\":\"FUNCTION\",\"text\":\"get$\"},{\"tag\":\"FUNCTION\",\"text\":\"hex$\"},{\"tag\":\"FUNCTION\",\"text\":\"instr\"},{\"tag\":\"FUNCTION\",\"text\":\"lcase$\"},{\"tag\":\"FUNCTION\",\"text\":\"left$\"},{\"tag\":\"FUNCTION\",\"text\":\"len\"},{\"tag\":\"FUNCTION\",\"text\":\"mid$\"},{\"tag\":\"FUNCTION\",\"text\":\"oct$\"},{\"tag\":\"FUNCTION\",\"text\":\"right$\"},{\"tag\":\"FUNCTION\",\"text\":\"space$\"},{\"tag\":\"FUNCTION\",\"text\":\"str$\"},{\"tag\":\"FUNCTION\",\"text\":\"string$\"},{\"tag\":\"FUNCTION\",\"text\":\"ucase$\"},{\"tag\":\"FUNCTION\",\"text\":\"val\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
