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
public class NqcLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"/*\",\"NAME\":\"commentStart\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"*/\",\"NAME\":\"commentEnd\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"//\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\",+-=<>/?^&*\",\"NAME\":\"wordBreakChars\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*(((if|while)\\\\s*\\\\(|else\\\\s*|else\\\\s+if\\\\s*\\\\(|for\\\\s*\\\\(.*\\\\))[^{;]*)\",\"NAME\":\"indentNextLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"doubleBracketIndent\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"DIGIT_RE\":\"(0x[\\\\p{XDigit}]+[lL]?|[\\\\p{Digit}]+(e[\\\\p{Digit}]*)?[lLdDfF]?)\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"COMMENT1\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"/*\"},{\"tag\":\"END\",\"text\":\"*/\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"NO_LINE_BREAK\":\"TRUE\",\"TYPE\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"KEYWORD2\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"//\",\"attrs\":{\"TYPE\":\"COMMENT2\"}},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"}\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"{\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\":\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LABEL\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"__event_src\"},{\"tag\":\"KEYWORD1\",\"text\":\"__sensor\"},{\"tag\":\"KEYWORD1\",\"text\":\"__type\"},{\"tag\":\"KEYWORD1\",\"text\":\"abs\"},{\"tag\":\"KEYWORD1\",\"text\":\"aquire\"},{\"tag\":\"KEYWORD1\",\"text\":\"catch\"},{\"tag\":\"KEYWORD1\",\"text\":\"const\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"case\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"default\"},{\"tag\":\"KEYWORD1\",\"text\":\"do\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"monitor\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"repeat\"},{\"tag\":\"KEYWORD1\",\"text\":\"sign\"},{\"tag\":\"KEYWORD1\",\"text\":\"start\"},{\"tag\":\"KEYWORD1\",\"text\":\"stop\"},{\"tag\":\"KEYWORD1\",\"text\":\"sub\"},{\"tag\":\"KEYWORD1\",\"text\":\"switch\"},{\"tag\":\"KEYWORD1\",\"text\":\"task\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD2\",\"text\":\"asm\"},{\"tag\":\"KEYWORD2\",\"text\":\"inline\"},{\"tag\":\"KEYWORD3\",\"text\":\"int\"},{\"tag\":\"KEYWORD3\",\"text\":\"void\"},{\"tag\":\"LITERAL2\",\"text\":\"true\"},{\"tag\":\"LITERAL2\",\"text\":\"false\"},{\"tag\":\"LITERAL2\",\"text\":\"NULL\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_1\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_2\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_3\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TYPE_NONE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TYPE_TOUCH\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TYPE_TEMPERATURE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TYPE_LIGHT\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TYPE_ROTATION\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_RAW\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_BOOL\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_EDGE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_PULSE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_PERCENT\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_FAHRENHEIT\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_CELSIUS\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_MODE_ROTATION\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_TOUCH\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_LIGHT\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_EDGE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_PULSE\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_FAHRENHEIT\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_CELSIUS\"},{\"tag\":\"LITERAL2\",\"text\":\"SENSOR_ROTATION\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_A\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_B\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_C\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_OFF\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_ON\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_FLOAT\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_FWD\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_REV\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_TOOGLE\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_FULL\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_HALF\"},{\"tag\":\"LITERAL2\",\"text\":\"OUT_LOW\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_CLICK\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_DOUBLE_BEEP\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_DOWN\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_UP\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_LOW_BEEP\"},{\"tag\":\"LITERAL2\",\"text\":\"SOUND_FAST_UP\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_WATCH\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_OUT_A\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_OUT_B\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_OUT_C\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_SENSOR_1\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_SENSOR_2\"},{\"tag\":\"LITERAL2\",\"text\":\"DISPLAY_SENSOR_3\"},{\"tag\":\"LITERAL2\",\"text\":\"TX_POWER_LO\"},{\"tag\":\"LITERAL2\",\"text\":\"TX_POWER_HI\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_COMM_DEFAULT\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_COMM_4800\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_COMM_DUTY25\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_COMM_76KHZ\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_PREAMBLE\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_DEFAULT\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_NEGATED\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_CHECKSUM\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_RCX\"},{\"tag\":\"LITERAL2\",\"text\":\"SERIAL_PACKET_\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_OUT_A\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_OUT_B\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_OUT_C\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_SOUND\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_USER_1\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_USER_2\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_USER_3\"},{\"tag\":\"LITERAL2\",\"text\":\"ACQUIRE_USER_4\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_PRESSED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_RELEASED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_PULSE\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_EDGE\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_FASTCHANGE\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_LOW\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_NORMAL\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_HIGH\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_CLICK\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_DOUBLECLICK\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TYPE_MESSAGE\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_1_PRESSED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_1_RELEASED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_2_PRESSED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_2_RELEASED\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_LIGHT_HIGH\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_LIGHT_NORMAL\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_LIGHT_LOW\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_LIGHT_CLICK\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_LIGHT_DOUBLECLICK\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_COUNTER_0\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_COUNTER_1\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TIMER_0\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TIMER_1\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_TIMER_2\"},{\"tag\":\"LITERAL2\",\"text\":\"EVENT_MESSAGE\"}]}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
