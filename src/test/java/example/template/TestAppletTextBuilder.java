package example.template;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import example.template.model.Document;
import example.template.model.Subject;

public class TestAppletTextBuilder {

    private AppletTextBuilder builder;
    private Context ctx;

    @Before
    public void init() {
        builder = new AppletTextBuilder();
        ctx = new Context();
        ctx.setSubject(new Subject("s_id", "12345678", "Test", "Testesen", "12345", "a@b.c"));
    }

    @Test
    public void testOneDocument() {
        ctx.addDocument(new Document("docId", "h-a-s-h", "Loan agreement", "LoanAgreement 123"));

        String appletText = builder.buildAppletText(ctx);
        assertNotNull(appletText);

        System.out.println(appletText);
    }

    @Test
    public void testTwoDocuments() {
        ctx.addDocument(new Document("docId1", "h-a-s-h-1", "Loan agreement", "LoanAgreement 123"));
        ctx.addDocument(new Document("docId2", "h-a-s-h-2", "Insurance", "House insurance"));

        String appletText = builder.buildAppletText(ctx);
        assertNotNull(appletText);

        System.out.println(appletText);
    }
}
