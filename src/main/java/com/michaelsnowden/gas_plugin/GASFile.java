package com.michaelsnowden.gas_plugin;

import com.google.gson.JsonObject;

/**
 * @author michael.snowden
 */
public class GASFile {
    private final String id;
    private final String name;
    private final String type;
    private final String source;

    public GASFile(JsonObject jsonObject) {
        this(jsonObject.get("id").getAsString(), jsonObject.get("name").getAsString(), jsonObject.get
                ("type").getAsString(), jsonObject.get("source").getAsString());
    }

    public GASFile(String id, String name, String type, String source) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.source = source;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSource() {
        return source;
    }
}
