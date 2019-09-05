package com.ptt.envision;

import com.envision.apim.poseidon.config.PConfig;
import com.envision.apim.poseidon.core.Poseidon;

public class demo {
    public static void main(String[] args) {

        String appKey = "accessKey";
        String appSecret = "secretKey";

        String response = Poseidon.config(PConfig.init().appKey(appKey).appSecret(appSecret))
                .url("https://apigw-address/asset-service/v2.0/assets?orgId=orgId&assetId=assetId")
                .method("GET")
                .sync();
        System.out.println(response);
    }
}