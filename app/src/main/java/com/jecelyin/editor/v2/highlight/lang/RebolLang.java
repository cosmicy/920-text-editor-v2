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
public class RebolLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{[(\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}])\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"comment {\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\";\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"_-\",\"NAME\":\"noWordSep\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"FALSE\",\"IGNORE_CASE\":\"TRUE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"comment {\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"comment{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\";\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<>\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"'\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"abs\"},{\"tag\":\"KEYWORD1\",\"text\":\"absolute\"},{\"tag\":\"KEYWORD1\",\"text\":\"add\"},{\"tag\":\"KEYWORD1\",\"text\":\"and~\"},{\"tag\":\"KEYWORD1\",\"text\":\"at\"},{\"tag\":\"KEYWORD1\",\"text\":\"back\"},{\"tag\":\"KEYWORD1\",\"text\":\"change\"},{\"tag\":\"KEYWORD1\",\"text\":\"clear\"},{\"tag\":\"KEYWORD1\",\"text\":\"complement\"},{\"tag\":\"KEYWORD1\",\"text\":\"copy\"},{\"tag\":\"KEYWORD1\",\"text\":\"cp\"},{\"tag\":\"KEYWORD1\",\"text\":\"divide\"},{\"tag\":\"KEYWORD1\",\"text\":\"fifth\"},{\"tag\":\"KEYWORD1\",\"text\":\"find\"},{\"tag\":\"KEYWORD1\",\"text\":\"first\"},{\"tag\":\"KEYWORD1\",\"text\":\"fourth\"},{\"tag\":\"KEYWORD1\",\"text\":\"head\"},{\"tag\":\"KEYWORD1\",\"text\":\"insert\"},{\"tag\":\"KEYWORD1\",\"text\":\"last\"},{\"tag\":\"KEYWORD1\",\"text\":\"make\"},{\"tag\":\"KEYWORD1\",\"text\":\"max\"},{\"tag\":\"KEYWORD1\",\"text\":\"maximum\"},{\"tag\":\"KEYWORD1\",\"text\":\"min\"},{\"tag\":\"KEYWORD1\",\"text\":\"minimum\"},{\"tag\":\"KEYWORD1\",\"text\":\"multiply\"},{\"tag\":\"KEYWORD1\",\"text\":\"negate\"},{\"tag\":\"KEYWORD1\",\"text\":\"next\"},{\"tag\":\"KEYWORD1\",\"text\":\"or~\"},{\"tag\":\"KEYWORD1\",\"text\":\"pick\"},{\"tag\":\"KEYWORD1\",\"text\":\"poke\"},{\"tag\":\"KEYWORD1\",\"text\":\"power\"},{\"tag\":\"KEYWORD1\",\"text\":\"random\"},{\"tag\":\"KEYWORD1\",\"text\":\"remainder\"},{\"tag\":\"KEYWORD1\",\"text\":\"remove\"},{\"tag\":\"KEYWORD1\",\"text\":\"second\"},{\"tag\":\"KEYWORD1\",\"text\":\"select\"},{\"tag\":\"KEYWORD1\",\"text\":\"skip\"},{\"tag\":\"KEYWORD1\",\"text\":\"sort\"},{\"tag\":\"KEYWORD1\",\"text\":\"subtract\"},{\"tag\":\"KEYWORD1\",\"text\":\"tail\"},{\"tag\":\"KEYWORD1\",\"text\":\"third\"},{\"tag\":\"KEYWORD1\",\"text\":\"to\"},{\"tag\":\"KEYWORD1\",\"text\":\"trim\"},{\"tag\":\"KEYWORD1\",\"text\":\"xor~\"},{\"tag\":\"KEYWORD1\",\"text\":\"alias\"},{\"tag\":\"KEYWORD1\",\"text\":\"all\"},{\"tag\":\"KEYWORD1\",\"text\":\"any\"},{\"tag\":\"KEYWORD1\",\"text\":\"arccosine\"},{\"tag\":\"KEYWORD1\",\"text\":\"arcsine\"},{\"tag\":\"KEYWORD1\",\"text\":\"arctangent\"},{\"tag\":\"KEYWORD1\",\"text\":\"bind\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"browse\"},{\"tag\":\"KEYWORD1\",\"text\":\"call\"},{\"tag\":\"KEYWORD1\",\"text\":\"caret-to-offset\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"checksum\"},{\"tag\":\"KEYWORD1\",\"text\":\"close\"},{\"tag\":\"KEYWORD1\",\"text\":\"comment\"},{\"tag\":\"KEYWORD1\",\"text\":\"compose\"},{\"tag\":\"KEYWORD1\",\"text\":\"compress\"},{\"tag\":\"KEYWORD1\",\"text\":\"cosine\"},{\"tag\":\"KEYWORD1\",\"text\":\"debase\"},{\"tag\":\"KEYWORD1\",\"text\":\"decompress\"},{\"tag\":\"KEYWORD1\",\"text\":\"dehex\"},{\"tag\":\"KEYWORD1\",\"text\":\"detab\"},{\"tag\":\"KEYWORD1\",\"text\":\"dh-compute-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"dh-generate-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"dh-make-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"difference\"},{\"tag\":\"KEYWORD1\",\"text\":\"disarm\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"dsa-generate-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"dsa-make-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"dsa-make-signature\"},{\"tag\":\"KEYWORD1\",\"text\":\"dsa-verify-signature\"},{\"tag\":\"KEYWORD1\",\"text\":\"either\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"enbase\"},{\"tag\":\"KEYWORD1\",\"text\":\"entab\"},{\"tag\":\"KEYWORD1\",\"text\":\"exclude\"},{\"tag\":\"KEYWORD1\",\"text\":\"exit\"},{\"tag\":\"KEYWORD1\",\"text\":\"exp\"},{\"tag\":\"KEYWORD1\",\"text\":\"foreach\"},{\"tag\":\"KEYWORD1\",\"text\":\"form\"},{\"tag\":\"KEYWORD1\",\"text\":\"free\"},{\"tag\":\"KEYWORD1\",\"text\":\"get\"},{\"tag\":\"KEYWORD1\",\"text\":\"get-modes\"},{\"tag\":\"KEYWORD1\",\"text\":\"halt\"},{\"tag\":\"KEYWORD1\",\"text\":\"hide\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"intersect\"},{\"tag\":\"KEYWORD1\",\"text\":\"load\"},{\"tag\":\"KEYWORD1\",\"text\":\"log-10\"},{\"tag\":\"KEYWORD1\",\"text\":\"log-2\"},{\"tag\":\"KEYWORD1\",\"text\":\"log-e\"},{\"tag\":\"KEYWORD1\",\"text\":\"loop\"},{\"tag\":\"KEYWORD1\",\"text\":\"lowercase\"},{\"tag\":\"KEYWORD1\",\"text\":\"maximum-of\"},{\"tag\":\"KEYWORD1\",\"text\":\"minimum-of\"},{\"tag\":\"KEYWORD1\",\"text\":\"mold\"},{\"tag\":\"KEYWORD1\",\"text\":\"not\"},{\"tag\":\"KEYWORD1\",\"text\":\"now\"},{\"tag\":\"KEYWORD1\",\"text\":\"offset-to-caret\"},{\"tag\":\"KEYWORD1\",\"text\":\"open\"},{\"tag\":\"KEYWORD1\",\"text\":\"parse\"},{\"tag\":\"KEYWORD1\",\"text\":\"prin\"},{\"tag\":\"KEYWORD1\",\"text\":\"print\"},{\"tag\":\"KEYWORD1\",\"text\":\"protect\"},{\"tag\":\"KEYWORD1\",\"text\":\"q\"},{\"tag\":\"KEYWORD1\",\"text\":\"query\"},{\"tag\":\"KEYWORD1\",\"text\":\"quit\"},{\"tag\":\"KEYWORD1\",\"text\":\"read\"},{\"tag\":\"KEYWORD1\",\"text\":\"read-io\"},{\"tag\":\"KEYWORD1\",\"text\":\"recycle\"},{\"tag\":\"KEYWORD1\",\"text\":\"reduce\"},{\"tag\":\"KEYWORD1\",\"text\":\"repeat\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"reverse\"},{\"tag\":\"KEYWORD1\",\"text\":\"rsa-encrypt\"},{\"tag\":\"KEYWORD1\",\"text\":\"rsa-generate-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"rsa-make-key\"},{\"tag\":\"KEYWORD1\",\"text\":\"save\"},{\"tag\":\"KEYWORD1\",\"text\":\"secure\"},{\"tag\":\"KEYWORD1\",\"text\":\"set\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-modes\"},{\"tag\":\"KEYWORD1\",\"text\":\"show\"},{\"tag\":\"KEYWORD1\",\"text\":\"sine\"},{\"tag\":\"KEYWORD1\",\"text\":\"size-text\"},{\"tag\":\"KEYWORD1\",\"text\":\"square-root\"},{\"tag\":\"KEYWORD1\",\"text\":\"tangent\"},{\"tag\":\"KEYWORD1\",\"text\":\"textinfo\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-hex\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-local-file\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-rebol-file\"},{\"tag\":\"KEYWORD1\",\"text\":\"trace\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD1\",\"text\":\"union\"},{\"tag\":\"KEYWORD1\",\"text\":\"unique\"},{\"tag\":\"KEYWORD1\",\"text\":\"unprotect\"},{\"tag\":\"KEYWORD1\",\"text\":\"unset\"},{\"tag\":\"KEYWORD1\",\"text\":\"until\"},{\"tag\":\"KEYWORD1\",\"text\":\"update\"},{\"tag\":\"KEYWORD1\",\"text\":\"uppercase\"},{\"tag\":\"KEYWORD1\",\"text\":\"use\"},{\"tag\":\"KEYWORD1\",\"text\":\"wait\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"write\"},{\"tag\":\"KEYWORD1\",\"text\":\"write-io\"},{\"tag\":\"KEYWORD1\",\"text\":\"basic-syntax-header\"},{\"tag\":\"KEYWORD1\",\"text\":\"crlf\"},{\"tag\":\"KEYWORD1\",\"text\":\"font-fixed\"},{\"tag\":\"KEYWORD1\",\"text\":\"font-sans-serif\"},{\"tag\":\"KEYWORD1\",\"text\":\"font-serif\"},{\"tag\":\"KEYWORD1\",\"text\":\"list-words\"},{\"tag\":\"KEYWORD1\",\"text\":\"outstr\"},{\"tag\":\"KEYWORD1\",\"text\":\"val\"},{\"tag\":\"KEYWORD1\",\"text\":\"value\"},{\"tag\":\"KEYWORD1\",\"text\":\"about\"},{\"tag\":\"KEYWORD1\",\"text\":\"alert\"},{\"tag\":\"KEYWORD1\",\"text\":\"alter\"},{\"tag\":\"KEYWORD1\",\"text\":\"append\"},{\"tag\":\"KEYWORD1\",\"text\":\"array\"},{\"tag\":\"KEYWORD1\",\"text\":\"ask\"},{\"tag\":\"KEYWORD1\",\"text\":\"boot-prefs\"},{\"tag\":\"KEYWORD1\",\"text\":\"build-tag\"},{\"tag\":\"KEYWORD1\",\"text\":\"center-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"change-dir\"},{\"tag\":\"KEYWORD1\",\"text\":\"charset\"},{\"tag\":\"KEYWORD1\",\"text\":\"choose\"},{\"tag\":\"KEYWORD1\",\"text\":\"clean-path\"},{\"tag\":\"KEYWORD1\",\"text\":\"clear-fields\"},{\"tag\":\"KEYWORD1\",\"text\":\"confine\"},{\"tag\":\"KEYWORD1\",\"text\":\"confirm\"},{\"tag\":\"KEYWORD1\",\"text\":\"context\"},{\"tag\":\"KEYWORD1\",\"text\":\"cvs-date\"},{\"tag\":\"KEYWORD1\",\"text\":\"cvs-version\"},{\"tag\":\"KEYWORD1\",\"text\":\"decode-cgi\"},{\"tag\":\"KEYWORD1\",\"text\":\"decode-url\"},{\"tag\":\"KEYWORD1\",\"text\":\"deflag-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"delete\"},{\"tag\":\"KEYWORD1\",\"text\":\"demo\"},{\"tag\":\"KEYWORD1\",\"text\":\"desktop\"},{\"tag\":\"KEYWORD1\",\"text\":\"dirize\"},{\"tag\":\"KEYWORD1\",\"text\":\"dispatch\"},{\"tag\":\"KEYWORD1\",\"text\":\"do-boot\"},{\"tag\":\"KEYWORD1\",\"text\":\"do-events\"},{\"tag\":\"KEYWORD1\",\"text\":\"do-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"do-face-alt\"},{\"tag\":\"KEYWORD1\",\"text\":\"does\"},{\"tag\":\"KEYWORD1\",\"text\":\"dump-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"dump-pane\"},{\"tag\":\"KEYWORD1\",\"text\":\"echo\"},{\"tag\":\"KEYWORD1\",\"text\":\"editor\"},{\"tag\":\"KEYWORD1\",\"text\":\"emailer\"},{\"tag\":\"KEYWORD1\",\"text\":\"emit\"},{\"tag\":\"KEYWORD1\",\"text\":\"extract\"},{\"tag\":\"KEYWORD1\",\"text\":\"find-by-type\"},{\"tag\":\"KEYWORD1\",\"text\":\"find-key-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"find-window\"},{\"tag\":\"KEYWORD1\",\"text\":\"flag-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"flash\"},{\"tag\":\"KEYWORD1\",\"text\":\"focus\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"forall\"},{\"tag\":\"KEYWORD1\",\"text\":\"forever\"},{\"tag\":\"KEYWORD1\",\"text\":\"forskip\"},{\"tag\":\"KEYWORD1\",\"text\":\"func\"},{\"tag\":\"KEYWORD1\",\"text\":\"function\"},{\"tag\":\"KEYWORD1\",\"text\":\"get-net-info\"},{\"tag\":\"KEYWORD1\",\"text\":\"get-style\"},{\"tag\":\"KEYWORD1\",\"text\":\"has\"},{\"tag\":\"KEYWORD1\",\"text\":\"help\"},{\"tag\":\"KEYWORD1\",\"text\":\"hide-popup\"},{\"tag\":\"KEYWORD1\",\"text\":\"import-email\"},{\"tag\":\"KEYWORD1\",\"text\":\"inform\"},{\"tag\":\"KEYWORD1\",\"text\":\"input\"},{\"tag\":\"KEYWORD1\",\"text\":\"insert-event-func\"},{\"tag\":\"KEYWORD1\",\"text\":\"join\"},{\"tag\":\"KEYWORD1\",\"text\":\"launch\"},{\"tag\":\"KEYWORD1\",\"text\":\"launch-thru\"},{\"tag\":\"KEYWORD1\",\"text\":\"layout\"},{\"tag\":\"KEYWORD1\",\"text\":\"license\"},{\"tag\":\"KEYWORD1\",\"text\":\"list-dir\"},{\"tag\":\"KEYWORD1\",\"text\":\"load-image\"},{\"tag\":\"KEYWORD1\",\"text\":\"load-prefs\"},{\"tag\":\"KEYWORD1\",\"text\":\"load-thru\"},{\"tag\":\"KEYWORD1\",\"text\":\"make-dir\"},{\"tag\":\"KEYWORD1\",\"text\":\"make-face\"},{\"tag\":\"KEYWORD1\",\"text\":\"net-error\"},{\"tag\":\"KEYWORD1\",\"text\":\"open-events\"},{\"tag\":\"KEYWORD1\",\"text\":\"parse-email-addrs\"},{\"tag\":\"KEYWORD1\",\"text\":\"parse-header\"},{\"tag\":\"KEYWORD1\",\"text\":\"parse-header-date\"},{\"tag\":\"KEYWORD1\",\"text\":\"parse-xml\"},{\"tag\":\"KEYWORD1\",\"text\":\"path-thru\"},{\"tag\":\"KEYWORD1\",\"text\":\"probe\"},{\"tag\":\"KEYWORD1\",\"text\":\"protect-system\"},{\"tag\":\"KEYWORD1\",\"text\":\"read-net\"},{\"tag\":\"KEYWORD1\",\"text\":\"read-thru\"},{\"tag\":\"KEYWORD1\",\"text\":\"reboot\"},{\"tag\":\"KEYWORD1\",\"text\":\"reform\"},{\"tag\":\"KEYWORD1\",\"text\":\"rejoin\"},{\"tag\":\"KEYWORD1\",\"text\":\"remold\"},{\"tag\":\"KEYWORD1\",\"text\":\"remove-event-func\"},{\"tag\":\"KEYWORD1\",\"text\":\"rename\"},{\"tag\":\"KEYWORD1\",\"text\":\"repend\"},{\"tag\":\"KEYWORD1\",\"text\":\"replace\"},{\"tag\":\"KEYWORD1\",\"text\":\"request\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-color\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-date\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-download\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-file\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-list\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-pass\"},{\"tag\":\"KEYWORD1\",\"text\":\"request-text\"},{\"tag\":\"KEYWORD1\",\"text\":\"resend\"},{\"tag\":\"KEYWORD1\",\"text\":\"save-prefs\"},{\"tag\":\"KEYWORD1\",\"text\":\"save-user\"},{\"tag\":\"KEYWORD1\",\"text\":\"scroll-para\"},{\"tag\":\"KEYWORD1\",\"text\":\"send\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-font\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-net\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-para\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-style\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-user\"},{\"tag\":\"KEYWORD1\",\"text\":\"set-user-name\"},{\"tag\":\"KEYWORD1\",\"text\":\"show-popup\"},{\"tag\":\"KEYWORD1\",\"text\":\"source\"},{\"tag\":\"KEYWORD1\",\"text\":\"split-path\"},{\"tag\":\"KEYWORD1\",\"text\":\"stylize\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"throw-on-error\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-binary\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-bitset\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-block\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-char\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-date\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-decimal\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-email\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-event\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-file\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-get-word\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-hash\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-idate\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-image\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-integer\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-issue\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-list\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-lit-path\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-lit-word\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-logic\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-money\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-none\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-pair\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-paren\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-path\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-refinement\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-set-path\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-set-word\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-string\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-tag\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-time\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-tuple\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-url\"},{\"tag\":\"KEYWORD1\",\"text\":\"to-word\"},{\"tag\":\"KEYWORD1\",\"text\":\"unfocus\"},{\"tag\":\"KEYWORD1\",\"text\":\"uninstall\"},{\"tag\":\"KEYWORD1\",\"text\":\"unview\"},{\"tag\":\"KEYWORD1\",\"text\":\"upgrade\"},{\"tag\":\"KEYWORD1\",\"text\":\"Usage\"},{\"tag\":\"KEYWORD1\",\"text\":\"vbug\"},{\"tag\":\"KEYWORD1\",\"text\":\"view\"},{\"tag\":\"KEYWORD1\",\"text\":\"view-install\"},{\"tag\":\"KEYWORD1\",\"text\":\"view-prefs\"},{\"tag\":\"KEYWORD1\",\"text\":\"what\"},{\"tag\":\"KEYWORD1\",\"text\":\"what-dir\"},{\"tag\":\"KEYWORD1\",\"text\":\"write-user\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"at\"},{\"tag\":\"KEYWORD1\",\"text\":\"space\"},{\"tag\":\"KEYWORD1\",\"text\":\"pad\"},{\"tag\":\"KEYWORD1\",\"text\":\"across\"},{\"tag\":\"KEYWORD1\",\"text\":\"below\"},{\"tag\":\"KEYWORD1\",\"text\":\"origin\"},{\"tag\":\"KEYWORD1\",\"text\":\"guide\"},{\"tag\":\"KEYWORD1\",\"text\":\"tabs\"},{\"tag\":\"KEYWORD1\",\"text\":\"indent\"},{\"tag\":\"KEYWORD1\",\"text\":\"style\"},{\"tag\":\"KEYWORD1\",\"text\":\"styles\"},{\"tag\":\"KEYWORD1\",\"text\":\"size\"},{\"tag\":\"KEYWORD1\",\"text\":\"sense\"},{\"tag\":\"KEYWORD1\",\"text\":\"backcolor\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"none\"},{\"tag\":\"KEYWORD2\",\"text\":\"action?\"},{\"tag\":\"KEYWORD2\",\"text\":\"any-block?\"},{\"tag\":\"KEYWORD2\",\"text\":\"any-function?\"},{\"tag\":\"KEYWORD2\",\"text\":\"any-string?\"},{\"tag\":\"KEYWORD2\",\"text\":\"any-type?\"},{\"tag\":\"KEYWORD2\",\"text\":\"any-word?\"},{\"tag\":\"KEYWORD2\",\"text\":\"binary?\"},{\"tag\":\"KEYWORD2\",\"text\":\"bitset?\"},{\"tag\":\"KEYWORD2\",\"text\":\"block?\"},{\"tag\":\"KEYWORD2\",\"text\":\"char?\"},{\"tag\":\"KEYWORD2\",\"text\":\"datatype?\"},{\"tag\":\"KEYWORD2\",\"text\":\"date?\"},{\"tag\":\"KEYWORD2\",\"text\":\"decimal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"email?\"},{\"tag\":\"KEYWORD2\",\"text\":\"empty?\"},{\"tag\":\"KEYWORD2\",\"text\":\"equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"error?\"},{\"tag\":\"KEYWORD2\",\"text\":\"even?\"},{\"tag\":\"KEYWORD2\",\"text\":\"event?\"},{\"tag\":\"KEYWORD2\",\"text\":\"file?\"},{\"tag\":\"KEYWORD2\",\"text\":\"function?\"},{\"tag\":\"KEYWORD2\",\"text\":\"get-word?\"},{\"tag\":\"KEYWORD2\",\"text\":\"greater-or-equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"greater?\"},{\"tag\":\"KEYWORD2\",\"text\":\"hash?\"},{\"tag\":\"KEYWORD2\",\"text\":\"head?\"},{\"tag\":\"KEYWORD2\",\"text\":\"image?\"},{\"tag\":\"KEYWORD2\",\"text\":\"index?\"},{\"tag\":\"KEYWORD2\",\"text\":\"integer?\"},{\"tag\":\"KEYWORD2\",\"text\":\"issue?\"},{\"tag\":\"KEYWORD2\",\"text\":\"length?\"},{\"tag\":\"KEYWORD2\",\"text\":\"lesser-or-equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"lesser?\"},{\"tag\":\"KEYWORD2\",\"text\":\"library?\"},{\"tag\":\"KEYWORD2\",\"text\":\"list?\"},{\"tag\":\"KEYWORD2\",\"text\":\"lit-path?\"},{\"tag\":\"KEYWORD2\",\"text\":\"lit-word?\"},{\"tag\":\"KEYWORD2\",\"text\":\"logic?\"},{\"tag\":\"KEYWORD2\",\"text\":\"money?\"},{\"tag\":\"KEYWORD2\",\"text\":\"native?\"},{\"tag\":\"KEYWORD2\",\"text\":\"negative?\"},{\"tag\":\"KEYWORD2\",\"text\":\"none?\"},{\"tag\":\"KEYWORD2\",\"text\":\"not-equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"number?\"},{\"tag\":\"KEYWORD2\",\"text\":\"object?\"},{\"tag\":\"KEYWORD2\",\"text\":\"odd?\"},{\"tag\":\"KEYWORD2\",\"text\":\"op?\"},{\"tag\":\"KEYWORD2\",\"text\":\"pair?\"},{\"tag\":\"KEYWORD2\",\"text\":\"paren?\"},{\"tag\":\"KEYWORD2\",\"text\":\"path?\"},{\"tag\":\"KEYWORD2\",\"text\":\"port?\"},{\"tag\":\"KEYWORD2\",\"text\":\"positive?\"},{\"tag\":\"KEYWORD2\",\"text\":\"refinement?\"},{\"tag\":\"KEYWORD2\",\"text\":\"routine?\"},{\"tag\":\"KEYWORD2\",\"text\":\"same?\"},{\"tag\":\"KEYWORD2\",\"text\":\"series?\"},{\"tag\":\"KEYWORD2\",\"text\":\"set-path?\"},{\"tag\":\"KEYWORD2\",\"text\":\"set-word?\"},{\"tag\":\"KEYWORD2\",\"text\":\"strict-equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"strict-not-equal?\"},{\"tag\":\"KEYWORD2\",\"text\":\"string?\"},{\"tag\":\"KEYWORD2\",\"text\":\"struct?\"},{\"tag\":\"KEYWORD2\",\"text\":\"tag?\"},{\"tag\":\"KEYWORD2\",\"text\":\"tail?\"},{\"tag\":\"KEYWORD2\",\"text\":\"time?\"},{\"tag\":\"KEYWORD2\",\"text\":\"tuple?\"},{\"tag\":\"KEYWORD2\",\"text\":\"unset?\"},{\"tag\":\"KEYWORD2\",\"text\":\"url?\"},{\"tag\":\"KEYWORD2\",\"text\":\"word?\"},{\"tag\":\"KEYWORD2\",\"text\":\"zero?\"},{\"tag\":\"KEYWORD2\",\"text\":\"connected?\"},{\"tag\":\"KEYWORD2\",\"text\":\"crypt-strength?\"},{\"tag\":\"KEYWORD2\",\"text\":\"exists-key?\"},{\"tag\":\"KEYWORD2\",\"text\":\"input?\"},{\"tag\":\"KEYWORD2\",\"text\":\"script?\"},{\"tag\":\"KEYWORD2\",\"text\":\"type?\"},{\"tag\":\"KEYWORD2\",\"text\":\"value?\"},{\"tag\":\"KEYWORD2\",\"text\":\"?\"},{\"tag\":\"KEYWORD2\",\"text\":\"??\"},{\"tag\":\"KEYWORD2\",\"text\":\"dir?\"},{\"tag\":\"KEYWORD2\",\"text\":\"exists-thru?\"},{\"tag\":\"KEYWORD2\",\"text\":\"exists?\"},{\"tag\":\"KEYWORD2\",\"text\":\"flag-face?\"},{\"tag\":\"KEYWORD2\",\"text\":\"found?\"},{\"tag\":\"KEYWORD2\",\"text\":\"in-window?\"},{\"tag\":\"KEYWORD2\",\"text\":\"info?\"},{\"tag\":\"KEYWORD2\",\"text\":\"inside?\"},{\"tag\":\"KEYWORD2\",\"text\":\"link-app?\"},{\"tag\":\"KEYWORD2\",\"text\":\"link?\"},{\"tag\":\"KEYWORD2\",\"text\":\"modified?\"},{\"tag\":\"KEYWORD2\",\"text\":\"offset?\"},{\"tag\":\"KEYWORD2\",\"text\":\"outside?\"},{\"tag\":\"KEYWORD2\",\"text\":\"screen-offset?\"},{\"tag\":\"KEYWORD2\",\"text\":\"size?\"},{\"tag\":\"KEYWORD2\",\"text\":\"span?\"},{\"tag\":\"KEYWORD2\",\"text\":\"view?\"},{\"tag\":\"KEYWORD2\",\"text\":\"viewed?\"},{\"tag\":\"KEYWORD2\",\"text\":\"win-offset?\"},{\"tag\":\"KEYWORD2\",\"text\":\"within?\"},{\"tag\":\"KEYWORD3\",\"text\":\"action!\"},{\"tag\":\"KEYWORD3\",\"text\":\"any-block!\"},{\"tag\":\"KEYWORD3\",\"text\":\"any-function!\"},{\"tag\":\"KEYWORD3\",\"text\":\"any-string!\"},{\"tag\":\"KEYWORD3\",\"text\":\"any-type!\"},{\"tag\":\"KEYWORD3\",\"text\":\"any-word!\"},{\"tag\":\"KEYWORD3\",\"text\":\"binary!\"},{\"tag\":\"KEYWORD3\",\"text\":\"bitset!\"},{\"tag\":\"KEYWORD3\",\"text\":\"block!\"},{\"tag\":\"KEYWORD3\",\"text\":\"char!\"},{\"tag\":\"KEYWORD3\",\"text\":\"datatype!\"},{\"tag\":\"KEYWORD3\",\"text\":\"date!\"},{\"tag\":\"KEYWORD3\",\"text\":\"decimal!\"},{\"tag\":\"KEYWORD3\",\"text\":\"email!\"},{\"tag\":\"KEYWORD3\",\"text\":\"error!\"},{\"tag\":\"KEYWORD3\",\"text\":\"event!\"},{\"tag\":\"KEYWORD3\",\"text\":\"file!\"},{\"tag\":\"KEYWORD3\",\"text\":\"function!\"},{\"tag\":\"KEYWORD3\",\"text\":\"get-word!\"},{\"tag\":\"KEYWORD3\",\"text\":\"hash!\"},{\"tag\":\"KEYWORD3\",\"text\":\"image!\"},{\"tag\":\"KEYWORD3\",\"text\":\"integer!\"},{\"tag\":\"KEYWORD3\",\"text\":\"issue!\"},{\"tag\":\"KEYWORD3\",\"text\":\"library!\"},{\"tag\":\"KEYWORD3\",\"text\":\"list!\"},{\"tag\":\"KEYWORD3\",\"text\":\"lit-path!\"},{\"tag\":\"KEYWORD3\",\"text\":\"lit-word!\"},{\"tag\":\"KEYWORD3\",\"text\":\"logic!\"},{\"tag\":\"KEYWORD3\",\"text\":\"money!\"},{\"tag\":\"KEYWORD3\",\"text\":\"native!\"},{\"tag\":\"KEYWORD3\",\"text\":\"none!\"},{\"tag\":\"KEYWORD3\",\"text\":\"number!\"},{\"tag\":\"KEYWORD3\",\"text\":\"object!\"},{\"tag\":\"KEYWORD3\",\"text\":\"op!\"},{\"tag\":\"KEYWORD3\",\"text\":\"pair!\"},{\"tag\":\"KEYWORD3\",\"text\":\"paren!\"},{\"tag\":\"KEYWORD3\",\"text\":\"path!\"},{\"tag\":\"KEYWORD3\",\"text\":\"port!\"},{\"tag\":\"KEYWORD3\",\"text\":\"refinement!\"},{\"tag\":\"KEYWORD3\",\"text\":\"routine!\"},{\"tag\":\"KEYWORD3\",\"text\":\"series!\"},{\"tag\":\"KEYWORD3\",\"text\":\"set-path!\"},{\"tag\":\"KEYWORD3\",\"text\":\"set-word!\"},{\"tag\":\"KEYWORD3\",\"text\":\"string!\"},{\"tag\":\"KEYWORD3\",\"text\":\"struct!\"},{\"tag\":\"KEYWORD3\",\"text\":\"symbol!\"},{\"tag\":\"KEYWORD3\",\"text\":\"tag!\"},{\"tag\":\"KEYWORD3\",\"text\":\"time!\"},{\"tag\":\"KEYWORD3\",\"text\":\"tuple!\"},{\"tag\":\"KEYWORD3\",\"text\":\"unset!\"},{\"tag\":\"KEYWORD3\",\"text\":\"url!\"},{\"tag\":\"KEYWORD3\",\"text\":\"word!\"},{\"tag\":\"LITERAL2\",\"text\":\"true\"},{\"tag\":\"LITERAL2\",\"text\":\"false\"},{\"tag\":\"LITERAL2\",\"text\":\"self\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
