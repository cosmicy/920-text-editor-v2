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
public class PowerdynamoLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\" @ %^*()+=|\\\\{}[]:;,.?$&\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"<!--\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"-->\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-script\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--script\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-data\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--data\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-document\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--document\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-script\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--evaluate\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-script\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--execute\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--formatting\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--/formatting\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--include\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--label\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"transact-sql::MAIN\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_error_code\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_error_info\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_state\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_on_no_error\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--/sql_on_no_error\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_on_error\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--/sql_on_error\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_on_no_rows\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--/sql_on_no_rows\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--sql_on_rows\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-tag-general\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--/sql_on_rows\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--\"},{\"tag\":\"END\",\"text\":\"-->\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"html::JAVASCRIPT\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<SCRIPT\"},{\"tag\":\"END\",\"text\":\"<\\/SCRIPT>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"html::CSS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<STYLE\"},{\"tag\":\"END\",\"text\":\"<\\/STYLE>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"KEYWORD2\",\"DELEGATE\":\"xml::DTD-TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"MARKUP\",\"DELEGATE\":\"TAGS\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<\"},{\"tag\":\"END\",\"text\":\">\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_WORD_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL2\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"&\"},{\"tag\":\"END\",\"text\":\";\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TAGS\",\"DEFAULT\":\"MARKUP\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-script\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--script\"},{\"tag\":\"END\",\"text\":\"--?>\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"TAGS_LITERAL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"TAGS_LITERAL\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"TAGS_LITERAL\",\"DEFAULT\":\"LITERAL1\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LABEL\",\"DELEGATE\":\"powerdynamo-script\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"<!--script\"},{\"tag\":\"END\",\"text\":\"?-->\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"powerdynamo-script\",\"HIGHLIGHT_DIGITS\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\",\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\";\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"[\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"?\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"@\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"abstract\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"byte\"},{\"tag\":\"KEYWORD1\",\"text\":\"boolean\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"class\"},{\"tag\":\"KEYWORD1\",\"text\":\"char\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD1\",\"text\":\"double\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"exists\"},{\"tag\":\"KEYWORD1\",\"text\":\"extends\"},{\"tag\":\"KEYWORD1\",\"text\":\"false\"},{\"tag\":\"KEYWORD1\",\"text\":\"file\"},{\"tag\":\"KEYWORD1\",\"text\":\"final\"},{\"tag\":\"KEYWORD1\",\"text\":\"float\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"finally\"},{\"tag\":\"KEYWORD1\",\"text\":\"function\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"import\"},{\"tag\":\"KEYWORD1\",\"text\":\"implements\"},{\"tag\":\"KEYWORD1\",\"text\":\"int\"},{\"tag\":\"KEYWORD1\",\"text\":\"interface\"},{\"tag\":\"KEYWORD1\",\"text\":\"instanceof\"},{\"tag\":\"KEYWORD1\",\"text\":\"long\"},{\"tag\":\"KEYWORD1\",\"text\":\"length\"},{\"tag\":\"KEYWORD1\",\"text\":\"native\"},{\"tag\":\"KEYWORD1\",\"text\":\"new\"},{\"tag\":\"KEYWORD1\",\"text\":\"null\"},{\"tag\":\"KEYWORD1\",\"text\":\"package\"},{\"tag\":\"KEYWORD1\",\"text\":\"private\"},{\"tag\":\"KEYWORD1\",\"text\":\"protected\"},{\"tag\":\"KEYWORD1\",\"text\":\"public\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"synchronized\"},{\"tag\":\"KEYWORD1\",\"text\":\"short\"},{\"tag\":\"KEYWORD1\",\"text\":\"static\"},{\"tag\":\"KEYWORD1\",\"text\":\"super\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD1\",\"text\":\"true\"},{\"tag\":\"KEYWORD1\",\"text\":\"this\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw\"},{\"tag\":\"KEYWORD1\",\"text\":\"throws\"},{\"tag\":\"KEYWORD1\",\"text\":\"threadsafe\"},{\"tag\":\"KEYWORD1\",\"text\":\"transient\"},{\"tag\":\"KEYWORD1\",\"text\":\"var\"},{\"tag\":\"KEYWORD1\",\"text\":\"void\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD2\"},{\"tag\":\"KEYWORD2\",\"text\":\"document\"},{\"tag\":\"KEYWORD2\",\"text\":\"connection\"},{\"tag\":\"KEYWORD2\",\"text\":\"file\"},{\"tag\":\"KEYWORD2\",\"text\":\"query\"},{\"tag\":\"KEYWORD2\",\"text\":\"session\"},{\"tag\":\"KEYWORD2\",\"text\":\"site\"},{\"tag\":\"KEYWORD2\",\"text\":\"system\"},{\"tag\":\"KEYWORD2\",\"text\":\"typeof\"},{\"tag\":\"KEYWORD3\",\"text\":\"AskQuestion\"},{\"tag\":\"KEYWORD3\",\"text\":\"autoCommit\"},{\"tag\":\"KEYWORD3\",\"text\":\"Close\"},{\"tag\":\"KEYWORD3\",\"text\":\"Commit\"},{\"tag\":\"KEYWORD3\",\"text\":\"Connect\"},{\"tag\":\"KEYWORD3\",\"text\":\"CreateConnection\"},{\"tag\":\"KEYWORD3\",\"text\":\"CreateDocument\"},{\"tag\":\"KEYWORD3\",\"text\":\"CreatePropertySheet\"},{\"tag\":\"KEYWORD3\",\"text\":\"CreateQuery\"},{\"tag\":\"KEYWORD3\",\"text\":\"CreateWizard\"},{\"tag\":\"KEYWORD3\",\"text\":\"cachedOutputTimeOut\"},{\"tag\":\"KEYWORD3\",\"text\":\"charAt\"},{\"tag\":\"KEYWORD3\",\"text\":\"connected\"},{\"tag\":\"KEYWORD3\",\"text\":\"connection\"},{\"tag\":\"KEYWORD3\",\"text\":\"connectionId\"},{\"tag\":\"KEYWORD3\",\"text\":\"connectionName\"},{\"tag\":\"KEYWORD3\",\"text\":\"connectionType\"},{\"tag\":\"KEYWORD3\",\"text\":\"connectParameters\"},{\"tag\":\"KEYWORD3\",\"text\":\"contentType\"},{\"tag\":\"KEYWORD3\",\"text\":\"DeleteConnection\"},{\"tag\":\"KEYWORD3\",\"text\":\"DeleteDocument\"},{\"tag\":\"KEYWORD3\",\"text\":\"Disconnect\"},{\"tag\":\"KEYWORD3\",\"text\":\"database\"},{\"tag\":\"KEYWORD3\",\"text\":\"dataSource\"},{\"tag\":\"KEYWORD3\",\"text\":\"dataSourceList\"},{\"tag\":\"KEYWORD3\",\"text\":\"description\"},{\"tag\":\"KEYWORD3\",\"text\":\"Exec\"},{\"tag\":\"KEYWORD3\",\"text\":\"Execute\"},{\"tag\":\"KEYWORD3\",\"text\":\"ExportTo\"},{\"tag\":\"KEYWORD3\",\"text\":\"eof\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorNumber\"},{\"tag\":\"KEYWORD3\",\"text\":\"errorString\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetColumnCount\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetColumnIndex\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetColumnLabel\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetConnection\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetConnectionIdList\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetConnectionNameList\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetCWD\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetDirectory\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetDocument\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetEmpty\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetEnv\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetErrorCode\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetErrorInfo\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetEventList\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetFilePtr\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetGenerated\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetRootDocument\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetRowCount\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetServerVariable\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetState\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetSupportedMoves\"},{\"tag\":\"KEYWORD3\",\"text\":\"GetValue\"},{\"tag\":\"KEYWORD3\",\"text\":\"ImportFrom\"},{\"tag\":\"KEYWORD3\",\"text\":\"Include\"},{\"tag\":\"KEYWORD3\",\"text\":\"id\"},{\"tag\":\"KEYWORD3\",\"text\":\"indexOf\"},{\"tag\":\"KEYWORD3\",\"text\":\"lastIndexOf\"},{\"tag\":\"KEYWORD3\",\"text\":\"lastModified\"},{\"tag\":\"KEYWORD3\",\"text\":\"length\"},{\"tag\":\"KEYWORD3\",\"text\":\"location\"},{\"tag\":\"KEYWORD3\",\"text\":\"Move\"},{\"tag\":\"KEYWORD3\",\"text\":\"MoveFirst\"},{\"tag\":\"KEYWORD3\",\"text\":\"MoveLast\"},{\"tag\":\"KEYWORD3\",\"text\":\"MoveNext\"},{\"tag\":\"KEYWORD3\",\"text\":\"MovePrevious\"},{\"tag\":\"KEYWORD3\",\"text\":\"MoveRelative\"},{\"tag\":\"KEYWORD3\",\"text\":\"mode\"},{\"tag\":\"KEYWORD3\",\"text\":\"name\"},{\"tag\":\"KEYWORD3\",\"text\":\"OnEvent\"},{\"tag\":\"KEYWORD3\",\"text\":\"Open\"},{\"tag\":\"KEYWORD3\",\"text\":\"Opened\"},{\"tag\":\"KEYWORD3\",\"text\":\"parent\"},{\"tag\":\"KEYWORD3\",\"text\":\"password\"},{\"tag\":\"KEYWORD3\",\"text\":\"ReadChar\"},{\"tag\":\"KEYWORD3\",\"text\":\"ReadLine\"},{\"tag\":\"KEYWORD3\",\"text\":\"Refresh\"},{\"tag\":\"KEYWORD3\",\"text\":\"Rollback\"},{\"tag\":\"KEYWORD3\",\"text\":\"redirect\"},{\"tag\":\"KEYWORD3\",\"text\":\"Seek\"},{\"tag\":\"KEYWORD3\",\"text\":\"SetEnv\"},{\"tag\":\"KEYWORD3\",\"text\":\"SetSQL\"},{\"tag\":\"KEYWORD3\",\"text\":\"ShowMessage\"},{\"tag\":\"KEYWORD3\",\"text\":\"substring\"},{\"tag\":\"KEYWORD3\",\"text\":\"server\"},{\"tag\":\"KEYWORD3\",\"text\":\"simulateCursors\"},{\"tag\":\"KEYWORD3\",\"text\":\"size\"},{\"tag\":\"KEYWORD3\",\"text\":\"source\"},{\"tag\":\"KEYWORD3\",\"text\":\"status\"},{\"tag\":\"KEYWORD3\",\"text\":\"timeOut\"},{\"tag\":\"KEYWORD3\",\"text\":\"toLowerCase\"},{\"tag\":\"KEYWORD3\",\"text\":\"toUpperCase\"},{\"tag\":\"KEYWORD3\",\"text\":\"type\"},{\"tag\":\"KEYWORD3\",\"text\":\"userId\"},{\"tag\":\"KEYWORD3\",\"text\":\"value\"},{\"tag\":\"KEYWORD3\",\"text\":\"WriteLine\"},{\"tag\":\"KEYWORD3\",\"text\":\"Write\"},{\"tag\":\"KEYWORD3\",\"text\":\"write\"},{\"tag\":\"KEYWORD3\",\"text\":\"writeln\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"powerdynamo-tag-general\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"NAME\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"powerdynamo-tag-data\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"NAME\"},{\"tag\":\"KEYWORD2\",\"text\":\"QUERY\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"powerdynamo-tag-document\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"CONTENT_TYPE\"},{\"tag\":\"KEYWORD2\",\"text\":\"REDIRECT\"},{\"tag\":\"KEYWORD2\",\"text\":\"STATUS\"},{\"tag\":\"KEYWORD2\",\"text\":\"CACHED_OUTPUT_TIMEOUT\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
