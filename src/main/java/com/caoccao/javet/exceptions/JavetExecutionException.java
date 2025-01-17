/*
 *    Copyright 2021. caoccao.com Sam Cao
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.caoccao.javet.exceptions;

/**
 * The type Javet execution exception.
 *
 * @since 0.7.0
 */
public class JavetExecutionException extends BaseJavetScriptingException {
    /**
     * Instantiates a new Javet execution exception.
     *
     * @param message       the message
     * @param resourceName  the resource name
     * @param sourceLine    the source line
     * @param lineNumber    the line number
     * @param startColumn   the start column
     * @param endColumn     the end column
     * @param startPosition the start position
     * @param endPosition   the end position
     * @since 0.7.0
     */
    public JavetExecutionException(
            String message, String resourceName, String sourceLine,
            int lineNumber, int startColumn, int endColumn, int startPosition, int endPosition) {
        super(JavetError.ExecutionFailure, message,
                resourceName, sourceLine, lineNumber, startColumn, endColumn, startPosition, endPosition);
    }
}
