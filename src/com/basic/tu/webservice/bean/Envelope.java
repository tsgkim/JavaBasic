package com.basic.tu.webservice.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import lombok.Data;

/**
 * @company: MEGVII
 * @author: tushiguang
 * @create: 2021/7/29 17:09
 **/
@XStreamAlias("S:Envelope")
@Data
public class Envelope {
    @XStreamAlias("S:Body")
    private Body body;

    @Data
    public static class Body {
        @XStreamAlias("int:sendSupplyPathToSnc")
        private SendSupplyPathToSnc sendSupplyPathToSnc;

        @Data
        public static class SendSupplyPathToSnc {
            @XStreamAlias("int:paths")
            private Paths paths;

            @Data
            public static class Paths {
                @XStreamAlias("int:XT_SUPPLYPATH")
                private XTSUPPLYPATH xtsupplypath;

                @Data
                public static class XTSUPPLYPATH {
                    @XStreamAlias("int:BAS_ITEM_SERVICE_RANGE_ID")
                    private String aa;
                }
            }
        }
    }
}
