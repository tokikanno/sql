/*
 *   Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file. This file is distributed
 *   on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *   express or implied. See the License for the specific language governing
 *   permissions and limitations under the License.
 */

package com.amazon.opendistroforelasticsearch.ppl.expression.model;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@EqualsAndHashCode
@RequiredArgsConstructor
public class ExprBooleanValue implements ExprValue {
    private final Boolean value;

    @Override
    public Object value() {
        return value;
    }

    @Override
    public ExprValueKind kind() {
        return ExprValueKind.BOOLEAN_VALUE;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SSBooleanValue{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
