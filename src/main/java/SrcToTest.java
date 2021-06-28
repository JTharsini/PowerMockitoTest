public class SrcToTest
{
  public String srcMethodToTest(String id)
  {
    String idRet = AssetCache.get(id);
    return idRet + "*";
  }
}
