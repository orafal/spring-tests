package example.template;

import java.util.ArrayList;
import java.util.List;

import example.template.model.Document;
import example.template.model.Subject;

/**
 * Defines context available to the template processor.
 */
public class Context {
    private List<Document> documents = new ArrayList<Document>();
    private Subject subject;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public void addDocument(Document document) {
        documents.add(document);
    }

    public Document[] getDocuments() {
        return documents.toArray(new Document[documents.size()]);
    }
}
