package example.template.model;

/**
 * Models a document with properties as in Signicat's Document WSDL.
 */
public class Document {
    private final String id;
    private final String externalReference;
    private final String description;
    private final String signTextEntry;

    public Document(String id, String externalReference, String description, String signTextEntry) {
        this.id = id;
        this.externalReference = externalReference;
        this.description = description;
        this.signTextEntry = signTextEntry;
    }

    public String getId() {
        return id;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public String getDescription() {
        return description;
    }

    public String getSignTextEntry() {
        return signTextEntry;
    }
}
