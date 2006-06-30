/*
 * Copyright 2004,2005 The Apache Software Foundation.
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

package org.apache.rahas;

public interface Constants {
    
    public final static String WST_NS = "http://schemas.xmlsoap.org/ws/2005/02/trust";
    public final static String WST_PREFIX = "wst";
    
    public final static String WSP_NS = "http://schemas.xmlsoap.org/ws/2004/09/policy";
    public final static String WSP_PREFIX = "wsp";
    
    //Local names
    public final static String REQUEST_TYPE_LN = "RequestType";
    public final static String TOKEN_TYPE_LN = "TokenType";
    public final static String REQUEST_SECURITY_TOKEN_LN = "RequestSecurityToken";
    public static final String REQUESTED_PROOF_TOKEN_LN = "RequestedProofToken";
    public static final String REQUEST_SECURITY_TOKEN_RESPONSE_LN = "RequestSecurityTokenResponse";
    public static final String REQUESTED_SECURITY_TOKEN_LN = "RequestedSecurityToken";
    public final static String BINARY_SECRET_LN = "BinarySecret";
    public final static String REQUESTED_ATTACHED_REFERENCE_LN = "RequestedAttachedReference";
    public final static String REQUESTED_UNATTACHED_REFERENCE_LN = "RequestedUnattachedReference";
    public final static String KEY_SIZE_LN = "KeySize";
    public final static String ENTROPY_LN = "Entropy";
    public final static String APPLIES_TO_LN = "AppliesTo";
    public final static String LIFETIME_LN = "Lifetime";
    
    //RequestTypes
    public final static String REQ_TYPE_ISSUE = "http://schemas.xmlsoap.org/ws/2005/02/trust/Issue";
    public final static String REQ_TYPE_VALIDATE = "http://schemas.xmlsoap.org/ws/2005/02/trust/Validate";
    public final static String REQ_TYPE_RENEW = "http://schemas.xmlsoap.org/ws/2005/02/trust/Renew";
    public final static String REQ_TYPE_CANCEL = "http://schemas.xmlsoap.org/ws/2005/02/trust/Cancel";

    //Token types
    public final static String TOK_TYPE_SCT = "http://schemas.xmlsoap.org/ws/2005/02/sc/sct";
    public final static String TOK_TYPE_SAML_10="http://docs.oasis-open.org/wss/oasis-wss-saml-token-profile-1.1#SAMLV1.1";
    
    
    //RST actions
    public final static String RST_ACTON_ISSUE = "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/Issue";
    public final static String RST_ACTON_VALIDATE = "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/Renew";
    public final static String RST_ACTON_RENEW = "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/Cancel";
    public final static String RST_ACTON_CANCEL = "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/Validate";
    public final static String RST_ACTON_SCT = "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/SCT";
    
    //RSTR actions
    public final static String RSTR_ACTON_ISSUE = "http://schemas.xmlsoap.org/ws/2005/02/trust/RSTR/Issue";
    public final static String RSTR_ACTON_VALIDATE = "http://schemas.xmlsoap.org/ws/2005/02/trust/RSTR/Renew";
    public final static String RSTR_ACTON_RENEW = "http://schemas.xmlsoap.org/ws/2005/02/trust/RSTR/Cancel";
    public final static String RSTR_ACTON_CANCEL = "http://schemas.xmlsoap.org/ws/2005/02/trust/RSTR/Validate";
    public final static String RSTR_ACTON_SCT = "http://schemas.xmlsoap.org/ws/2005/02/trust/RSTR/SCT";
    
    //Attrs
    public final static String ATTR_TYPE = "Type";
    
    //Attr values
    public final static String BIN_SEC_TYPE_NONCE = WST_NS + "/Nonce";
}
