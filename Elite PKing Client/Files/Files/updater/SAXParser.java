import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class SAXParser extends DefaultHandler
{

    private String version;

    SAXParser()
    {
    }

    public void startElement(String s, String s1, String s2, Attributes attributes)
        throws SAXException
    {
        if(s1.equals("tag"))
        {
            version = attributes.getValue(attributes.getIndex("version"));
        }
    }

    public String getVersion()
    {
        return version;
    }
}