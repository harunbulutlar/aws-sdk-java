/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type containing information about the specified reusable
 * delegation set.
 * </p>
 */
public class GetReusableDelegationSetResult implements Serializable {

    /**
     * A complex type that contains the information about the nameservers for
     * the specified delegation set ID.
     */
    private DelegationSet delegationSet;

    /**
     * A complex type that contains the information about the nameservers for
     * the specified delegation set ID.
     *
     * @return A complex type that contains the information about the nameservers for
     *         the specified delegation set ID.
     */
    public DelegationSet getDelegationSet() {
        return delegationSet;
    }
    
    /**
     * A complex type that contains the information about the nameservers for
     * the specified delegation set ID.
     *
     * @param delegationSet A complex type that contains the information about the nameservers for
     *         the specified delegation set ID.
     */
    public void setDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
    }
    
    /**
     * A complex type that contains the information about the nameservers for
     * the specified delegation set ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param delegationSet A complex type that contains the information about the nameservers for
     *         the specified delegation set ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetReusableDelegationSetResult withDelegationSet(DelegationSet delegationSet) {
        this.delegationSet = delegationSet;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDelegationSet() != null) sb.append("DelegationSet: " + getDelegationSet() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDelegationSet() == null) ? 0 : getDelegationSet().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetReusableDelegationSetResult == false) return false;
        GetReusableDelegationSetResult other = (GetReusableDelegationSetResult)obj;
        
        if (other.getDelegationSet() == null ^ this.getDelegationSet() == null) return false;
        if (other.getDelegationSet() != null && other.getDelegationSet().equals(this.getDelegationSet()) == false) return false; 
        return true;
    }
    
}
    