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
public class IcalLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"COMMENT\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",;:=+/?^*&\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"75\",\"NAME\":\"maxLineLen\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"hard\",\"NAME\":\"wrap\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"1\",\"NAME\":\"indentSize\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"1\",\"NAME\":\"noTabs\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"1\",\"NAME\":\"tabSize\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VCALENDAR\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VCALENDAR\"},{\"tag\":\"END\",\"text\":\"END:VCALENDAR\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VCALENDAR\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VTIMEZONE\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VTIMEZONE\"},{\"tag\":\"END\",\"text\":\"END:VTIMEZONE\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VEVENT\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VEVENT\"},{\"tag\":\"END\",\"text\":\"END:VEVENT\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VEVENT\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VTODO\"},{\"tag\":\"END\",\"text\":\"END:VTODO\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VEVENT\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VJOURNAL\"},{\"tag\":\"END\",\"text\":\"END:VJOURNAL\"}]},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"CALSCALE\"},{\"tag\":\"LITERAL2\",\"text\":\"GREGORIAN\"},{\"tag\":\"KEYWORD2\",\"text\":\"METHOD\"},{\"tag\":\"KEYWORD2\",\"text\":\"PRODID\"},{\"tag\":\"KEYWORD2\",\"text\":\"VERSION\"},{\"tag\":\"LITERAL2\",\"text\":\"2.0\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VTIMEZONE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"DAYLIGHT\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:DAYLIGHT\"},{\"tag\":\"END\",\"text\":\"END:DAYLIGHT\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"STANDARD\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:STANDARD\"},{\"tag\":\"END\",\"text\":\"END:STANDARD\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"CUSTOM_KEYWORDS\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"TZID\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"DAYLIGHT\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VCALENDAR_KEYWORDS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VTIMEZONE_KEYWORDS\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"STANDARD\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VCALENDAR_KEYWORDS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VTIMEZONE_KEYWORDS\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VEVENT\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"FALSE\",\"AT_LINE_START\":\"TRUE\",\"DELEGATE\":\"VALARM\",\"MATCH_TYPE\":\"KEYWORD1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"BEGIN:VALARM\"},{\"tag\":\"END\",\"text\":\"END:VALARM\"}]},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VCALENDAR_KEYWORDS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"CUSTOM_KEYWORDS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VEVENT_KEYWORDS\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"ATTENDEE\"},{\"tag\":\"KEYWORD2\",\"text\":\"CATEGORIES\"},{\"tag\":\"KEYWORD2\",\"text\":\"CLASS\"},{\"tag\":\"LITERAL2\",\"text\":\"CONFIDENTIAL\"},{\"tag\":\"LITERAL2\",\"text\":\"PRIVATE\"},{\"tag\":\"LITERAL2\",\"text\":\"PUBLIC\"},{\"tag\":\"KEYWORD2\",\"text\":\"COMPLETED\"},{\"tag\":\"KEYWORD2\",\"text\":\"CREATED\"},{\"tag\":\"KEYWORD2\",\"text\":\"DESCRIPTION\"},{\"tag\":\"KEYWORD2\",\"text\":\"DTEND\"},{\"tag\":\"KEYWORD2\",\"text\":\"DTSTAMP\"},{\"tag\":\"KEYWORD2\",\"text\":\"DTSTART\"},{\"tag\":\"KEYWORD2\",\"text\":\"DUE\"},{\"tag\":\"KEYWORD2\",\"text\":\"LAST-MODIFIED\"},{\"tag\":\"KEYWORD2\",\"text\":\"LOCATION\"},{\"tag\":\"KEYWORD2\",\"text\":\"PERCENT-COMPLETE\"},{\"tag\":\"KEYWORD2\",\"text\":\"PRIORITY\"},{\"tag\":\"KEYWORD2\",\"text\":\"RECURRENCE-ID\"},{\"tag\":\"KEYWORD3\",\"text\":\"RSVP\"},{\"tag\":\"LITERAL3\",\"text\":\"FALSE\"},{\"tag\":\"LITERAL3\",\"text\":\"TRUE\"},{\"tag\":\"KEYWORD2\",\"text\":\"SEQUENCE\"},{\"tag\":\"KEYWORD2\",\"text\":\"STATUS\"},{\"tag\":\"KEYWORD2\",\"text\":\"SUMMARY\"},{\"tag\":\"KEYWORD2\",\"text\":\"TRANSP\"},{\"tag\":\"LITERAL2\",\"text\":\"OPAQUE\"},{\"tag\":\"LITERAL2\",\"text\":\"TRANSPARENT\"},{\"tag\":\"KEYWORD2\",\"text\":\"UID\"},{\"tag\":\"KEYWORD2\",\"text\":\"URL\"},{\"tag\":\"KEYWORD3\",\"text\":\"TZID\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VALARM\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"RIGHT\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"CUSTOM_KEYWORDS\"}},{\"tag\":\"IMPORT\",\"attrs\":{\"DELEGATE\":\"VEVENT_KEYWORDS\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"ACTION\"},{\"tag\":\"KEYWORD2\",\"text\":\"DESCRIPTION\"},{\"tag\":\"KEYWORD2\",\"text\":\"TRIGGER\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"RIGHT\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\":\",\"attrs\":{\"AT_LINE_START\":\"FALSE\",\"DELEGATE\":\"RIGHT_TEXT\",\"MATCH_TYPE\":\"OPERATOR\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"RIGHT_TEXT\",\"DEFAULT\":\"LITERAL4\",\"IGNORE_CASE\":\"FALSE\"}},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VCALENDAR_KEYWORDS\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"RRULE\"},{\"tag\":\"KEYWORD4\",\"text\":\"BYDAY\"},{\"tag\":\"KEYWORD4\",\"text\":\"BYMONTH\"},{\"tag\":\"KEYWORD4\",\"text\":\"FREQ\"},{\"tag\":\"KEYWORD4\",\"text\":\"INTERVAL\"},{\"tag\":\"LITERAL4\",\"text\":\"YEARLY\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VTIMEZONE_KEYWORDS\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD2\",\"text\":\"DTSTART\"},{\"tag\":\"KEYWORD2\",\"text\":\"TZNAME\"},{\"tag\":\"KEYWORD2\",\"text\":\"TZOFFSETFROM\"},{\"tag\":\"KEYWORD2\",\"text\":\"TZOFFSETTO\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"VEVENT_KEYWORDS\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"LITERAL2\",\"text\":\"CONFIRMED\"},{\"tag\":\"LITERAL2\",\"text\":\"PRIVATE\"},{\"tag\":\"KEYWORD3\",\"text\":\"VALUE\"},{\"tag\":\"LITERAL3\",\"text\":\"DATE\"},{\"tag\":\"LITERAL3\",\"text\":\"DURATION\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"CUSTOM_KEYWORDS\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"X-[A-Za-z-]+\",\"attrs\":{\"TYPE\":\"INVALID\",\"AT_LINE_START\":\"TRUE\",\"HASH_CHAR\":\"X\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
