package argo.jdom;

public final class JsonStringNodeBuilder implements JsonNodeBuilder
{
    private final String field_27244_a;

    JsonStringNodeBuilder(String par1Str)
    {
        field_27244_a = par1Str;
    }

    public JsonStringNode func_27243_a()
    {
        return JsonNodeFactories.aJsonString(field_27244_a);
    }

    public JsonNode buildNode()
    {
        return func_27243_a();
    }
}
