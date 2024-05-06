package api;

import com.google.gson.annotations.SerializedName;

public record ResponseApi(@SerializedName("result") String result,
                          @SerializedName("documentation") String documentation,
                          @SerializedName("terms_of_use") String termsOfUse,
                          @SerializedName("time_last_update_unix") int timeLastUpdateUnix,
                          @SerializedName("time_last_update_utc") String timeLastUpdateUtc,
                          @SerializedName("time_next_update_unix") int timeNextUpdateUnix,
                          @SerializedName("time_next_update_utc") String timeNextUpdateUtc,
                          @SerializedName("base_code") String baseCode,
                          @SerializedName("target_code") String targetCode,
                          @SerializedName("conversion_rate") double conversionRate,
                          @SerializedName("conversion_result") double finalValue) {
}

