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
public class SdlPrLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(block|channel|connection|decision|generator|input|macro|newtype|operator|package|procedure|process|refinement|service|start|state|substructure|syntype|system).*|\\\\s*(signal)\\\\s*\",\"NAME\":\"indentNextLines\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*#SDTREF\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"==\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"and\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"mod\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"not\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"or\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"rem\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"xor\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"active\"},{\"tag\":\"KEYWORD1\",\"text\":\"adding\"},{\"tag\":\"KEYWORD1\",\"text\":\"all\"},{\"tag\":\"KEYWORD1\",\"text\":\"alternative\"},{\"tag\":\"KEYWORD1\",\"text\":\"any\"},{\"tag\":\"KEYWORD1\",\"text\":\"as\"},{\"tag\":\"KEYWORD1\",\"text\":\"atleast\"},{\"tag\":\"KEYWORD1\",\"text\":\"axioms\"},{\"tag\":\"KEYWORD1\",\"text\":\"block\"},{\"tag\":\"KEYWORD1\",\"text\":\"call\"},{\"tag\":\"KEYWORD1\",\"text\":\"channel\"},{\"tag\":\"KEYWORD1\",\"text\":\"comment\"},{\"tag\":\"KEYWORD1\",\"text\":\"connect\"},{\"tag\":\"KEYWORD1\",\"text\":\"connection\"},{\"tag\":\"KEYWORD1\",\"text\":\"constant\"},{\"tag\":\"KEYWORD1\",\"text\":\"constants\"},{\"tag\":\"KEYWORD1\",\"text\":\"create\"},{\"tag\":\"KEYWORD1\",\"text\":\"dcl\"},{\"tag\":\"KEYWORD1\",\"text\":\"decision\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"end\"},{\"tag\":\"KEYWORD1\",\"text\":\"endalternative\"},{\"tag\":\"KEYWORD1\",\"text\":\"endblock\"},{\"tag\":\"KEYWORD1\",\"text\":\"endchannel\"},{\"tag\":\"KEYWORD1\",\"text\":\"endconnection\"},{\"tag\":\"KEYWORD1\",\"text\":\"enddecision\"},{\"tag\":\"KEYWORD1\",\"text\":\"endgenerator\"},{\"tag\":\"KEYWORD1\",\"text\":\"endmacro\"},{\"tag\":\"KEYWORD1\",\"text\":\"endnewtype\"},{\"tag\":\"KEYWORD1\",\"text\":\"endoperator\"},{\"tag\":\"KEYWORD1\",\"text\":\"endpackage\"},{\"tag\":\"KEYWORD1\",\"text\":\"endprocedure\"},{\"tag\":\"KEYWORD1\",\"text\":\"endprocess\"},{\"tag\":\"KEYWORD1\",\"text\":\"endrefinement\"},{\"tag\":\"KEYWORD1\",\"text\":\"endselect\"},{\"tag\":\"KEYWORD1\",\"text\":\"endservice\"},{\"tag\":\"KEYWORD1\",\"text\":\"endstate\"},{\"tag\":\"KEYWORD1\",\"text\":\"endsubstructure\"},{\"tag\":\"KEYWORD1\",\"text\":\"endsyntype\"},{\"tag\":\"KEYWORD1\",\"text\":\"endsystem\"},{\"tag\":\"KEYWORD1\",\"text\":\"env\"},{\"tag\":\"KEYWORD1\",\"text\":\"error\"},{\"tag\":\"KEYWORD1\",\"text\":\"export\"},{\"tag\":\"KEYWORD1\",\"text\":\"exported\"},{\"tag\":\"KEYWORD1\",\"text\":\"external\"},{\"tag\":\"KEYWORD1\",\"text\":\"fi\"},{\"tag\":\"KEYWORD1\",\"text\":\"finalized\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"fpar\"},{\"tag\":\"KEYWORD1\",\"text\":\"from\"},{\"tag\":\"KEYWORD1\",\"text\":\"gate\"},{\"tag\":\"KEYWORD1\",\"text\":\"generator\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"import\"},{\"tag\":\"KEYWORD1\",\"text\":\"imported\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"inherits\"},{\"tag\":\"KEYWORD1\",\"text\":\"input\"},{\"tag\":\"KEYWORD1\",\"text\":\"interface\"},{\"tag\":\"KEYWORD1\",\"text\":\"join\"},{\"tag\":\"KEYWORD1\",\"text\":\"literal\"},{\"tag\":\"KEYWORD1\",\"text\":\"literals\"},{\"tag\":\"KEYWORD1\",\"text\":\"macro\"},{\"tag\":\"KEYWORD1\",\"text\":\"macrodefinition\"},{\"tag\":\"KEYWORD1\",\"text\":\"macroid\"},{\"tag\":\"KEYWORD1\",\"text\":\"map\"},{\"tag\":\"KEYWORD1\",\"text\":\"nameclass\"},{\"tag\":\"KEYWORD1\",\"text\":\"newtype\"},{\"tag\":\"KEYWORD1\",\"text\":\"nextstate\"},{\"tag\":\"KEYWORD1\",\"text\":\"nodelay\"},{\"tag\":\"KEYWORD1\",\"text\":\"noequality\"},{\"tag\":\"KEYWORD1\",\"text\":\"none\"},{\"tag\":\"KEYWORD1\",\"text\":\"now\"},{\"tag\":\"KEYWORD1\",\"text\":\"offspring\"},{\"tag\":\"KEYWORD1\",\"text\":\"operator\"},{\"tag\":\"KEYWORD1\",\"text\":\"operators\"},{\"tag\":\"KEYWORD1\",\"text\":\"ordering\"},{\"tag\":\"KEYWORD1\",\"text\":\"out\"},{\"tag\":\"KEYWORD1\",\"text\":\"output\"},{\"tag\":\"KEYWORD1\",\"text\":\"package\"},{\"tag\":\"KEYWORD1\",\"text\":\"parent\"},{\"tag\":\"KEYWORD1\",\"text\":\"priority\"},{\"tag\":\"KEYWORD1\",\"text\":\"procedure\"},{\"tag\":\"KEYWORD1\",\"text\":\"process\"},{\"tag\":\"KEYWORD1\",\"text\":\"provided\"},{\"tag\":\"KEYWORD1\",\"text\":\"redefined\"},{\"tag\":\"KEYWORD1\",\"text\":\"referenced\"},{\"tag\":\"KEYWORD1\",\"text\":\"refinement\"},{\"tag\":\"KEYWORD1\",\"text\":\"remote\"},{\"tag\":\"KEYWORD1\",\"text\":\"reset\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"returns\"},{\"tag\":\"KEYWORD1\",\"text\":\"revealed\"},{\"tag\":\"KEYWORD1\",\"text\":\"reverse\"},{\"tag\":\"KEYWORD1\",\"text\":\"route\"},{\"tag\":\"KEYWORD1\",\"text\":\"save\"},{\"tag\":\"KEYWORD1\",\"text\":\"select\"},{\"tag\":\"KEYWORD1\",\"text\":\"self\"},{\"tag\":\"KEYWORD1\",\"text\":\"sender\"},{\"tag\":\"KEYWORD1\",\"text\":\"service\"},{\"tag\":\"KEYWORD1\",\"text\":\"set\"},{\"tag\":\"KEYWORD1\",\"text\":\"signal\"},{\"tag\":\"KEYWORD1\",\"text\":\"signallist\"},{\"tag\":\"KEYWORD1\",\"text\":\"signalroute\"},{\"tag\":\"KEYWORD1\",\"text\":\"signalset\"},{\"tag\":\"KEYWORD1\",\"text\":\"spelling\"},{\"tag\":\"KEYWORD1\",\"text\":\"start\"},{\"tag\":\"KEYWORD1\",\"text\":\"state\"},{\"tag\":\"KEYWORD1\",\"text\":\"stop\"},{\"tag\":\"KEYWORD1\",\"text\":\"struct\"},{\"tag\":\"KEYWORD1\",\"text\":\"substructure\"},{\"tag\":\"KEYWORD1\",\"text\":\"synonym\"},{\"tag\":\"KEYWORD1\",\"text\":\"syntype\"},{\"tag\":\"KEYWORD1\",\"text\":\"system\"},{\"tag\":\"KEYWORD1\",\"text\":\"task\"},{\"tag\":\"KEYWORD1\",\"text\":\"then\"},{\"tag\":\"KEYWORD1\",\"text\":\"this\"},{\"tag\":\"KEYWORD1\",\"text\":\"timer\"},{\"tag\":\"KEYWORD1\",\"text\":\"to\"},{\"tag\":\"KEYWORD1\",\"text\":\"type\"},{\"tag\":\"KEYWORD1\",\"text\":\"use\"},{\"tag\":\"KEYWORD1\",\"text\":\"via\"},{\"tag\":\"KEYWORD1\",\"text\":\"view\"},{\"tag\":\"KEYWORD1\",\"text\":\"viewed\"},{\"tag\":\"KEYWORD1\",\"text\":\"virtual\"},{\"tag\":\"KEYWORD1\",\"text\":\"with\"},{\"tag\":\"KEYWORD2\",\"text\":\"Boolean\"},{\"tag\":\"KEYWORD2\",\"text\":\"Character\"},{\"tag\":\"KEYWORD2\",\"text\":\"Charstring\"},{\"tag\":\"KEYWORD2\",\"text\":\"Duration\"},{\"tag\":\"KEYWORD2\",\"text\":\"Integer\"},{\"tag\":\"KEYWORD2\",\"text\":\"Natural\"},{\"tag\":\"KEYWORD2\",\"text\":\"Real\"},{\"tag\":\"KEYWORD2\",\"text\":\"PId\"},{\"tag\":\"KEYWORD2\",\"text\":\"Time\"},{\"tag\":\"KEYWORD3\",\"text\":\"Array\"},{\"tag\":\"KEYWORD3\",\"text\":\"String\"},{\"tag\":\"KEYWORD3\",\"text\":\"Powerset\"},{\"tag\":\"LITERAL1\",\"text\":\"false\"},{\"tag\":\"LITERAL1\",\"text\":\"null\"},{\"tag\":\"LITERAL1\",\"text\":\"true\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
