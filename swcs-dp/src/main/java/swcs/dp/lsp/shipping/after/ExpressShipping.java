package swcs.dp.lsp.shipping.after;

final class ExpressShipping implements TrackableShipping {

  @Override
  public void track(String id) { /* real tracking */ }
}