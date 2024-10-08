package org.example.people;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class OwnerJsonSerializationService {
    private Gson gson;

    @Inject
    public OwnerJsonSerializationService(Gson gson) {
        this.gson = gson;
    }

    public String serializeOwner(Owner owner) {
        return gson.toJson(owner);
    }
}