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
public class PythonLang implements LangDefine {
    private final static String JSON = "{\"tag\":\"MODE\",\"text\":\"\",\"child\":[{\"tag\":\"PROPS\",\"text\":\"\",\"child\":[{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"\\\\s*[^#]{3,}:\\\\s*(#.*)?\",\"NAME\":\"indentNextLines\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"{[\",\"NAME\":\"indentOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"}]\",\"NAME\":\"indentCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"(\",\"NAME\":\"unalignedOpenBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\")\",\"NAME\":\"unalignedCloseBrackets\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"^\\\\s*(pass|else\\\\s*:|elif\\\\s.*:|except(\\\\s.*)?:|finally\\\\s*:)\\\\s*(#.*)?$\",\"NAME\":\"unindentNextLines\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"^\\\\s*(else|elif\\\\s.*|except(\\\\s.*)?|finally)\\\\s*:\\\\s*(#.*)?\",\"NAME\":\"unindentThisLine\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"#\",\"NAME\":\"lineComment\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\":\",\"NAME\":\"electricKeys\"}},{\"tag\":\"PROPERTY\",\"attrs\":{\"VALUE\":\"false\",\"NAME\":\"ignoreWhitespace\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"HIGHLIGHT_DIGITS\":\"TRUE\",\"IGNORE_CASE\":\"FALSE\"},\"child\":[{\"tag\":\"EOL_SPAN\",\"text\":\"#\",\"attrs\":{\"TYPE\":\"COMMENT1\"}},{\"tag\":\"SPAN_REGEXP\",\"text\":\"\",\"attrs\":{\"DELEGATE\":\"python::MAIN\",\"MATCH_TYPE\":\"KEYWORD4\",\"HASH_CHAR\":\"@\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"@\\\\w+(?:\\\\.\\\\w+)*\\\\(\"},{\"tag\":\"END\",\"text\":\"\\\\)\"}]},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"@\",\"attrs\":{\"TYPE\":\"KEYWORD4\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"DELEGATE\":\"LITERAL_TWO\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\\\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\\\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL2\",\"DELEGATE\":\"LITERAL_TWO\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'''\"},{\"tag\":\"END\",\"text\":\"'''\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"LITERAL_ONE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"\\\"\"},{\"tag\":\"END\",\"text\":\"\\\"\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL1\",\"DELEGATE\":\"LITERAL_ONE\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"'\"},{\"tag\":\"END\",\"text\":\"'\"}]},{\"tag\":\"SEQ\",\"text\":\"=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"!\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<=\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"+\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"-\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"/\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"*\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\">\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"<\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"%\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"&\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"|\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"^\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\"~\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\":\",\"attrs\":{\"TYPE\":\"KEYWORD1\"}},{\"tag\":\"MARK_PREVIOUS\",\"text\":\"(\",\"attrs\":{\"TYPE\":\"FUNCTION\",\"MATCH_TYPE\":\"OPERATOR\"}},{\"tag\":\"SEQ\",\"text\":\")\",\"attrs\":{\"TYPE\":\"OPERATOR\"}},{\"tag\":\"KEYWORDS\",\"text\":\"\",\"child\":[{\"tag\":\"KEYWORD1\",\"text\":\"and\"},{\"tag\":\"KEYWORD1\",\"text\":\"as\"},{\"tag\":\"KEYWORD1\",\"text\":\"assert\"},{\"tag\":\"KEYWORD1\",\"text\":\"break\"},{\"tag\":\"KEYWORD1\",\"text\":\"class\"},{\"tag\":\"KEYWORD1\",\"text\":\"continue\"},{\"tag\":\"KEYWORD1\",\"text\":\"def\"},{\"tag\":\"KEYWORD1\",\"text\":\"del\"},{\"tag\":\"KEYWORD1\",\"text\":\"elif\"},{\"tag\":\"KEYWORD1\",\"text\":\"else\"},{\"tag\":\"KEYWORD1\",\"text\":\"except\"},{\"tag\":\"KEYWORD1\",\"text\":\"exec\"},{\"tag\":\"KEYWORD1\",\"text\":\"finally\"},{\"tag\":\"KEYWORD1\",\"text\":\"for\"},{\"tag\":\"KEYWORD1\",\"text\":\"from\"},{\"tag\":\"KEYWORD1\",\"text\":\"global\"},{\"tag\":\"KEYWORD1\",\"text\":\"if\"},{\"tag\":\"KEYWORD1\",\"text\":\"import\"},{\"tag\":\"KEYWORD1\",\"text\":\"in\"},{\"tag\":\"KEYWORD1\",\"text\":\"is\"},{\"tag\":\"KEYWORD1\",\"text\":\"lambda\"},{\"tag\":\"KEYWORD1\",\"text\":\"not\"},{\"tag\":\"KEYWORD1\",\"text\":\"or\"},{\"tag\":\"KEYWORD1\",\"text\":\"pass\"},{\"tag\":\"KEYWORD1\",\"text\":\"print\"},{\"tag\":\"KEYWORD1\",\"text\":\"raise\"},{\"tag\":\"KEYWORD1\",\"text\":\"return\"},{\"tag\":\"KEYWORD1\",\"text\":\"reversed\"},{\"tag\":\"KEYWORD1\",\"text\":\"sorted\"},{\"tag\":\"KEYWORD1\",\"text\":\"try\"},{\"tag\":\"KEYWORD1\",\"text\":\"while\"},{\"tag\":\"KEYWORD1\",\"text\":\"with\"},{\"tag\":\"KEYWORD1\",\"text\":\"yield\"},{\"tag\":\"KEYWORD1\",\"text\":\"self\"},{\"tag\":\"KEYWORD2\",\"text\":\"abs\"},{\"tag\":\"KEYWORD2\",\"text\":\"all\"},{\"tag\":\"KEYWORD2\",\"text\":\"any\"},{\"tag\":\"KEYWORD2\",\"text\":\"apply\"},{\"tag\":\"KEYWORD2\",\"text\":\"bool\"},{\"tag\":\"KEYWORD2\",\"text\":\"buffer\"},{\"tag\":\"KEYWORD2\",\"text\":\"callable\"},{\"tag\":\"KEYWORD2\",\"text\":\"chr\"},{\"tag\":\"KEYWORD2\",\"text\":\"classmethod\"},{\"tag\":\"KEYWORD2\",\"text\":\"cmp\"},{\"tag\":\"KEYWORD2\",\"text\":\"coerce\"},{\"tag\":\"KEYWORD2\",\"text\":\"compile\"},{\"tag\":\"KEYWORD2\",\"text\":\"complex\"},{\"tag\":\"KEYWORD2\",\"text\":\"delattr\"},{\"tag\":\"KEYWORD2\",\"text\":\"dict\"},{\"tag\":\"KEYWORD2\",\"text\":\"dir\"},{\"tag\":\"KEYWORD2\",\"text\":\"divmod\"},{\"tag\":\"KEYWORD2\",\"text\":\"enumerate\"},{\"tag\":\"KEYWORD2\",\"text\":\"eval\"},{\"tag\":\"KEYWORD2\",\"text\":\"execfile\"},{\"tag\":\"KEYWORD2\",\"text\":\"file\"},{\"tag\":\"KEYWORD2\",\"text\":\"filter\"},{\"tag\":\"KEYWORD2\",\"text\":\"float\"},{\"tag\":\"KEYWORD2\",\"text\":\"frozenset\"},{\"tag\":\"KEYWORD2\",\"text\":\"getattr\"},{\"tag\":\"KEYWORD2\",\"text\":\"globals\"},{\"tag\":\"KEYWORD2\",\"text\":\"hasattr\"},{\"tag\":\"KEYWORD2\",\"text\":\"hash\"},{\"tag\":\"KEYWORD2\",\"text\":\"hex\"},{\"tag\":\"KEYWORD2\",\"text\":\"id\"},{\"tag\":\"KEYWORD2\",\"text\":\"input\"},{\"tag\":\"KEYWORD2\",\"text\":\"int\"},{\"tag\":\"KEYWORD2\",\"text\":\"intern\"},{\"tag\":\"KEYWORD2\",\"text\":\"isinstance\"},{\"tag\":\"KEYWORD2\",\"text\":\"issubclass\"},{\"tag\":\"KEYWORD2\",\"text\":\"iter\"},{\"tag\":\"KEYWORD2\",\"text\":\"len\"},{\"tag\":\"KEYWORD2\",\"text\":\"list\"},{\"tag\":\"KEYWORD2\",\"text\":\"locals\"},{\"tag\":\"KEYWORD2\",\"text\":\"long\"},{\"tag\":\"KEYWORD2\",\"text\":\"map\"},{\"tag\":\"KEYWORD2\",\"text\":\"max\"},{\"tag\":\"KEYWORD2\",\"text\":\"min\"},{\"tag\":\"KEYWORD2\",\"text\":\"object\"},{\"tag\":\"KEYWORD2\",\"text\":\"oct\"},{\"tag\":\"KEYWORD2\",\"text\":\"open\"},{\"tag\":\"KEYWORD2\",\"text\":\"ord\"},{\"tag\":\"KEYWORD2\",\"text\":\"pow\"},{\"tag\":\"KEYWORD2\",\"text\":\"property\"},{\"tag\":\"KEYWORD2\",\"text\":\"range\"},{\"tag\":\"KEYWORD2\",\"text\":\"raw_input\"},{\"tag\":\"KEYWORD2\",\"text\":\"reduce\"},{\"tag\":\"KEYWORD2\",\"text\":\"reload\"},{\"tag\":\"KEYWORD2\",\"text\":\"repr\"},{\"tag\":\"KEYWORD2\",\"text\":\"round\"},{\"tag\":\"KEYWORD2\",\"text\":\"set\"},{\"tag\":\"KEYWORD2\",\"text\":\"setattr\"},{\"tag\":\"KEYWORD2\",\"text\":\"slice\"},{\"tag\":\"KEYWORD2\",\"text\":\"staticmethod\"},{\"tag\":\"KEYWORD2\",\"text\":\"str\"},{\"tag\":\"KEYWORD2\",\"text\":\"sum\"},{\"tag\":\"KEYWORD2\",\"text\":\"super\"},{\"tag\":\"KEYWORD2\",\"text\":\"tuple\"},{\"tag\":\"KEYWORD2\",\"text\":\"type\"},{\"tag\":\"KEYWORD2\",\"text\":\"unichr\"},{\"tag\":\"KEYWORD2\",\"text\":\"unicode\"},{\"tag\":\"KEYWORD2\",\"text\":\"vars\"},{\"tag\":\"KEYWORD2\",\"text\":\"xrange\"},{\"tag\":\"KEYWORD2\",\"text\":\"zip\"},{\"tag\":\"KEYWORD3\",\"text\":\"ArithmeticError\"},{\"tag\":\"KEYWORD3\",\"text\":\"AssertionError\"},{\"tag\":\"KEYWORD3\",\"text\":\"AttributeError\"},{\"tag\":\"KEYWORD3\",\"text\":\"DeprecationWarning\"},{\"tag\":\"KEYWORD3\",\"text\":\"EOFError\"},{\"tag\":\"KEYWORD3\",\"text\":\"EnvironmentError\"},{\"tag\":\"KEYWORD3\",\"text\":\"Exception\"},{\"tag\":\"KEYWORD3\",\"text\":\"FloatingPointError\"},{\"tag\":\"KEYWORD3\",\"text\":\"IOError\"},{\"tag\":\"KEYWORD3\",\"text\":\"ImportError\"},{\"tag\":\"KEYWORD3\",\"text\":\"IndentationError\"},{\"tag\":\"KEYWORD3\",\"text\":\"IndexError\"},{\"tag\":\"KEYWORD3\",\"text\":\"KeyError\"},{\"tag\":\"KEYWORD3\",\"text\":\"KeyboardInterrupt\"},{\"tag\":\"KEYWORD3\",\"text\":\"LookupError\"},{\"tag\":\"KEYWORD3\",\"text\":\"MemoryError\"},{\"tag\":\"KEYWORD3\",\"text\":\"NameError\"},{\"tag\":\"KEYWORD3\",\"text\":\"NotImplemented\"},{\"tag\":\"KEYWORD3\",\"text\":\"NotImplementedError\"},{\"tag\":\"KEYWORD3\",\"text\":\"OSError\"},{\"tag\":\"KEYWORD3\",\"text\":\"OverflowError\"},{\"tag\":\"KEYWORD3\",\"text\":\"OverflowWarning\"},{\"tag\":\"KEYWORD3\",\"text\":\"ReferenceError\"},{\"tag\":\"KEYWORD3\",\"text\":\"RuntimeError\"},{\"tag\":\"KEYWORD3\",\"text\":\"RuntimeWarning\"},{\"tag\":\"KEYWORD3\",\"text\":\"StandardError\"},{\"tag\":\"KEYWORD3\",\"text\":\"StopIteration\"},{\"tag\":\"KEYWORD3\",\"text\":\"SyntaxError\"},{\"tag\":\"KEYWORD3\",\"text\":\"SyntaxWarning\"},{\"tag\":\"KEYWORD3\",\"text\":\"SystemError\"},{\"tag\":\"KEYWORD3\",\"text\":\"SystemExit\"},{\"tag\":\"KEYWORD3\",\"text\":\"TabError\"},{\"tag\":\"KEYWORD3\",\"text\":\"TypeError\"},{\"tag\":\"KEYWORD3\",\"text\":\"UnboundLocalError\"},{\"tag\":\"KEYWORD3\",\"text\":\"UnicodeError\"},{\"tag\":\"KEYWORD3\",\"text\":\"UserWarning\"},{\"tag\":\"KEYWORD3\",\"text\":\"ValueError\"},{\"tag\":\"KEYWORD3\",\"text\":\"Warning\"},{\"tag\":\"KEYWORD3\",\"text\":\"WindowsError\"},{\"tag\":\"KEYWORD3\",\"text\":\"ZeroDivisionError\"},{\"tag\":\"KEYWORD3\",\"text\":\"BufferType\"},{\"tag\":\"KEYWORD3\",\"text\":\"BuiltinFunctionType\"},{\"tag\":\"KEYWORD3\",\"text\":\"BuiltinMethodType\"},{\"tag\":\"KEYWORD3\",\"text\":\"ClassType\"},{\"tag\":\"KEYWORD3\",\"text\":\"CodeType\"},{\"tag\":\"KEYWORD3\",\"text\":\"ComplexType\"},{\"tag\":\"KEYWORD3\",\"text\":\"DictProxyType\"},{\"tag\":\"KEYWORD3\",\"text\":\"DictType\"},{\"tag\":\"KEYWORD3\",\"text\":\"DictionaryType\"},{\"tag\":\"KEYWORD3\",\"text\":\"EllipsisType\"},{\"tag\":\"KEYWORD3\",\"text\":\"FileType\"},{\"tag\":\"KEYWORD3\",\"text\":\"FloatType\"},{\"tag\":\"KEYWORD3\",\"text\":\"FrameType\"},{\"tag\":\"KEYWORD3\",\"text\":\"FunctionType\"},{\"tag\":\"KEYWORD3\",\"text\":\"GeneratorType\"},{\"tag\":\"KEYWORD3\",\"text\":\"InstanceType\"},{\"tag\":\"KEYWORD3\",\"text\":\"IntType\"},{\"tag\":\"KEYWORD3\",\"text\":\"LambdaType\"},{\"tag\":\"KEYWORD3\",\"text\":\"ListType\"},{\"tag\":\"KEYWORD3\",\"text\":\"LongType\"},{\"tag\":\"KEYWORD3\",\"text\":\"MethodType\"},{\"tag\":\"KEYWORD3\",\"text\":\"ModuleType\"},{\"tag\":\"KEYWORD3\",\"text\":\"NoneType\"},{\"tag\":\"KEYWORD3\",\"text\":\"ObjectType\"},{\"tag\":\"KEYWORD3\",\"text\":\"SliceType\"},{\"tag\":\"KEYWORD3\",\"text\":\"StringType\"},{\"tag\":\"KEYWORD3\",\"text\":\"StringTypes\"},{\"tag\":\"KEYWORD3\",\"text\":\"TracebackType\"},{\"tag\":\"KEYWORD3\",\"text\":\"TupleType\"},{\"tag\":\"KEYWORD3\",\"text\":\"TypeType\"},{\"tag\":\"KEYWORD3\",\"text\":\"UnboundMethodType\"},{\"tag\":\"KEYWORD3\",\"text\":\"UnicodeType\"},{\"tag\":\"KEYWORD3\",\"text\":\"XRangeType\"},{\"tag\":\"KEYWORD3\",\"text\":\"False\"},{\"tag\":\"KEYWORD3\",\"text\":\"None\"},{\"tag\":\"KEYWORD3\",\"text\":\"True\"},{\"tag\":\"KEYWORD3\",\"text\":\"__abs__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__add__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__all__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__author__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__bases__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__builtins__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__call__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__class__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__cmp__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__coerce__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__contains__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__debug__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__del__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__delattr__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__delitem__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__delslice__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__dict__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__div__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__divmod__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__doc__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__docformat__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__eq__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__file__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__float__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__floordiv__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__future__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__ge__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__getattr__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__getattribute__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__getitem__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__getslice__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__gt__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__hash__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__hex__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__iadd__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__import__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__imul__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__init__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__int__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__invert__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__iter__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__le__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__len__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__long__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__lshift__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__lt__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__members__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__metaclass__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__mod__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__mro__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__mul__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__name__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__ne__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__neg__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__new__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__nonzero__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__oct__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__or__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__path__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__pos__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__pow__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__radd__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rdiv__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rdivmod__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__reduce__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__repr__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rfloordiv__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rlshift__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rmod__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rmul__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__ror__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rpow__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rrshift__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rsub__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rtruediv__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__rxor__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__setattr__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__setitem__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__setslice__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__self__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__slots__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__str__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__sub__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__truediv__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__version__\"},{\"tag\":\"KEYWORD3\",\"text\":\"__xor__\"}]}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LITERAL_ONE\",\"DEFAULT\":\"LITERAL1\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"%[.]?\\\\d*[diouxXeEfFgGcrs]\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"HASH_CHAR\":\"%\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"%\\\\([^)]+\\\\)[+ -]?\\\\d*[diouxXeEfFgGcrs]\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"HASH_CHAR\":\"%(\"}}]},{\"tag\":\"RULES\",\"text\":\"\",\"attrs\":{\"SET\":\"LITERAL_TWO\",\"DEFAULT\":\"LITERAL2\",\"ESCAPE\":\"\\\\\"},\"child\":[{\"tag\":\"SEQ_REGEXP\",\"text\":\"%\\\\d*[diouxXeEfFgGcrs]\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"HASH_CHAR\":\"%\"}},{\"tag\":\"SEQ_REGEXP\",\"text\":\"%\\\\([^)]+\\\\)[+ -]?\\\\d*[diouxXeEfFgGcrs]\",\"attrs\":{\"TYPE\":\"LITERAL4\",\"HASH_CHAR\":\"%(\"}},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"B{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"C{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"E{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"I{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"SPAN\",\"text\":\"\",\"attrs\":{\"TYPE\":\"LITERAL3\"},\"child\":[{\"tag\":\"BEGIN\",\"text\":\"L{\"},{\"tag\":\"END\",\"text\":\"}\"}]},{\"tag\":\"EOL_SPAN\",\"text\":\">>>\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LITERAL3\"}},{\"tag\":\"EOL_SPAN\",\"text\":\"...\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LITERAL3\"}},{\"tag\":\"MARK_FOLLOWING\",\"text\":\"@\",\"attrs\":{\"AT_WHITESPACE_END\":\"TRUE\",\"TYPE\":\"LITERAL3\"}}]}]}";

    @Override
    public String langDefine() {
        return JSON;
    }
}
