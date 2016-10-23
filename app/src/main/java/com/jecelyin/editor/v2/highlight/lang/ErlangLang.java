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
public class ErlangLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"%\",\"NAME\":\"lineComment\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\$(\\\\\\\\.|.)\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"LITERAL3\",\"HASH_CHAR\":\"$\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\?\\\\w*\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"LABEL\",\"HASH_CHAR\":\"?\"}},{\"tag\":\"SEQ\",\"text\":\"badarg\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"infinity\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"undefined\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"nocookie\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"false\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"true\",\"attrs\":{\"TYPE\":\"LITERAL3\"}},{\"tag\":\"SEQ\",\"text\":\"->\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\".\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\";\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"[\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"]\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\",\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"?\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bdiv\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"div\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\brem\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"rem\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bor\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"or\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bxor\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"xor\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bbor\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"bor\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bbxor\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"bxor\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bbsl\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"bsl\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bbsr\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"bsr\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\band\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"and\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bband\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"band\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bnot\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"not\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bbnot\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"bnot\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\bandalso\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"andalso\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"\\\\borelse\\\\b\",\"attrs\":{\"AT_WORD_START\":\"TRUE\",\"TYPE\":\"OPERATOR\",\"HASH_CHAR\":\"orelse\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"after\"},{\"tag\":\"KEYWORD1\",\"text\":\"begin\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"cond\"},{\"tag\":\"KEYWORD1\",\"text\":\"end\"},{\"tag\":\"KEYWORD1\",\"text\":\"fun\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"let\"},{\"tag\":\"KEYWORD1\",\"text\":\"of\"},{\"tag\":\"KEYWORD1\",\"text\":\"query\"},{\"tag\":\"KEYWORD1\",\"text\":\"receive\"},{\"tag\":\"KEYWORD1\",\"text\":\"when\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD2\",\"text\":\"abs\"},{\"tag\":\"KEYWORD2\",\"text\":\"alive\"},{\"tag\":\"KEYWORD2\",\"text\":\"apply\"},{\"tag\":\"KEYWORD2\",\"text\":\"atom_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"binary_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"binary_to_term\"},{\"tag\":\"KEYWORD2\",\"text\":\"concat_binary\"},{\"tag\":\"KEYWORD2\",\"text\":\"date\"},{\"tag\":\"KEYWORD2\",\"text\":\"disconnect_node\"},{\"tag\":\"KEYWORD2\",\"text\":\"element\"},{\"tag\":\"KEYWORD2\",\"text\":\"erase\"},{\"tag\":\"KEYWORD2\",\"text\":\"exit\"},{\"tag\":\"KEYWORD2\",\"text\":\"float\"},{\"tag\":\"KEYWORD2\",\"text\":\"float_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"get\"},{\"tag\":\"KEYWORD2\",\"text\":\"get_keys\"},{\"tag\":\"KEYWORD2\",\"text\":\"group_leader\"},{\"tag\":\"KEYWORD2\",\"text\":\"halt\"},{\"tag\":\"KEYWORD2\",\"text\":\"hd\"},{\"tag\":\"KEYWORD2\",\"text\":\"integer_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"is_alive\"},{\"tag\":\"KEYWORD2\",\"text\":\"length\"},{\"tag\":\"KEYWORD2\",\"text\":\"link\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_atom\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_binary\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_float\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_integer\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_pid\"},{\"tag\":\"KEYWORD2\",\"text\":\"list_to_tuple\"},{\"tag\":\"KEYWORD2\",\"text\":\"load_module\"},{\"tag\":\"KEYWORD2\",\"text\":\"make_ref\"},{\"tag\":\"KEYWORD2\",\"text\":\"monitor_node\"},{\"tag\":\"KEYWORD2\",\"text\":\"node\"},{\"tag\":\"KEYWORD2\",\"text\":\"nodes\"},{\"tag\":\"KEYWORD2\",\"text\":\"now\"},{\"tag\":\"KEYWORD2\",\"text\":\"open_port\"},{\"tag\":\"KEYWORD2\",\"text\":\"pid_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"process_flag\"},{\"tag\":\"KEYWORD2\",\"text\":\"process_info\"},{\"tag\":\"KEYWORD2\",\"text\":\"process\"},{\"tag\":\"KEYWORD2\",\"text\":\"put\"},{\"tag\":\"KEYWORD2\",\"text\":\"register\"},{\"tag\":\"KEYWORD2\",\"text\":\"registered\"},{\"tag\":\"KEYWORD2\",\"text\":\"round\"},{\"tag\":\"KEYWORD2\",\"text\":\"self\"},{\"tag\":\"KEYWORD2\",\"text\":\"setelement\"},{\"tag\":\"KEYWORD2\",\"text\":\"size\"},{\"tag\":\"KEYWORD2\",\"text\":\"spawn\"},{\"tag\":\"KEYWORD2\",\"text\":\"spawn_link\"},{\"tag\":\"KEYWORD2\",\"text\":\"split_binary\"},{\"tag\":\"KEYWORD2\",\"text\":\"statistics\"},{\"tag\":\"KEYWORD2\",\"text\":\"term_to_binary\"},{\"tag\":\"KEYWORD2\",\"text\":\"throw\"},{\"tag\":\"KEYWORD2\",\"text\":\"time\"},{\"tag\":\"KEYWORD2\",\"text\":\"tl\"},{\"tag\":\"KEYWORD2\",\"text\":\"trunc\"},{\"tag\":\"KEYWORD2\",\"text\":\"tuple_to_list\"},{\"tag\":\"KEYWORD2\",\"text\":\"unlink\"},{\"tag\":\"KEYWORD2\",\"text\":\"unregister\"},{\"tag\":\"KEYWORD2\",\"text\":\"whereis\"},{\"tag\":\"KEYWORD2\",\"text\":\"atom\"},{\"tag\":\"KEYWORD2\",\"text\":\"binary\"},{\"tag\":\"KEYWORD2\",\"text\":\"constant\"},{\"tag\":\"KEYWORD2\",\"text\":\"function\"},{\"tag\":\"KEYWORD2\",\"text\":\"integer\"},{\"tag\":\"KEYWORD2\",\"text\":\"list\"},{\"tag\":\"KEYWORD2\",\"text\":\"number\"},{\"tag\":\"KEYWORD2\",\"text\":\"pid\"},{\"tag\":\"KEYWORD2\",\"text\":\"ports\"},{\"tag\":\"KEYWORD2\",\"text\":\"port_close\"},{\"tag\":\"KEYWORD2\",\"text\":\"port_info\"},{\"tag\":\"KEYWORD2\",\"text\":\"reference\"},{\"tag\":\"KEYWORD2\",\"text\":\"record\"},{\"tag\":\"KEYWORD2\",\"text\":\"check_process_code\"},{\"tag\":\"KEYWORD2\",\"text\":\"delete_module\"},{\"tag\":\"KEYWORD2\",\"text\":\"get_cookie\"},{\"tag\":\"KEYWORD2\",\"text\":\"hash\"},{\"tag\":\"KEYWORD2\",\"text\":\"math\"},{\"tag\":\"KEYWORD2\",\"text\":\"module_loaded\"},{\"tag\":\"KEYWORD2\",\"text\":\"preloaded\"},{\"tag\":\"KEYWORD2\",\"text\":\"processes\"},{\"tag\":\"KEYWORD2\",\"text\":\"purge_module\"},{\"tag\":\"KEYWORD2\",\"text\":\"set_cookie\"},{\"tag\":\"KEYWORD2\",\"text\":\"set_node\"},{\"tag\":\"KEYWORD2\",\"text\":\"acos\"},{\"tag\":\"KEYWORD2\",\"text\":\"asin\"},{\"tag\":\"KEYWORD2\",\"text\":\"atan\"},{\"tag\":\"KEYWORD2\",\"text\":\"atan2\"},{\"tag\":\"KEYWORD2\",\"text\":\"cos\"},{\"tag\":\"KEYWORD2\",\"text\":\"cosh\"},{\"tag\":\"KEYWORD2\",\"text\":\"exp\"},{\"tag\":\"KEYWORD2\",\"text\":\"log\"},{\"tag\":\"KEYWORD2\",\"text\":\"log10\"},{\"tag\":\"KEYWORD2\",\"text\":\"pi\"},{\"tag\":\"KEYWORD2\",\"text\":\"pow\"},{\"tag\":\"KEYWORD2\",\"text\":\"power\"},{\"tag\":\"KEYWORD2\",\"text\":\"sin\"},{\"tag\":\"KEYWORD2\",\"text\":\"sinh\"},{\"tag\":\"KEYWORD2\",\"text\":\"sqrt\"},{\"tag\":\"KEYWORD2\",\"text\":\"tan\"},{\"tag\":\"KEYWORD2\",\"text\":\"tanh\"},{\"tag\":\"KEYWORD3\",\"text\":\"-behaviour\"},{\"tag\":\"KEYWORD3\",\"text\":\"-compile\"},{\"tag\":\"KEYWORD3\",\"text\":\"-define\"},{\"tag\":\"KEYWORD3\",\"text\":\"-else\"},{\"tag\":\"KEYWORD3\",\"text\":\"-endif\"},{\"tag\":\"KEYWORD3\",\"text\":\"-export\"},{\"tag\":\"KEYWORD3\",\"text\":\"-file\"},{\"tag\":\"KEYWORD3\",\"text\":\"-ifdef\"},{\"tag\":\"KEYWORD3\",\"text\":\"-ifndef\"},{\"tag\":\"KEYWORD3\",\"text\":\"-import\"},{\"tag\":\"KEYWORD3\",\"text\":\"-include\"},{\"tag\":\"KEYWORD3\",\"text\":\"-include_lib\"},{\"tag\":\"KEYWORD3\",\"text\":\"-module\"},{\"tag\":\"KEYWORD3\",\"text\":\"-record\"},{\"tag\":\"KEYWORD3\",\"text\":\"-undef\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
