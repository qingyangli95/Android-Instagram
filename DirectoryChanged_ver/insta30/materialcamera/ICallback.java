package group30.com.instagramclone2.materialcamera;

public interface ICallback {
  /**
   * It is called when the background operation completes. If the operation is successful, {@code
   * exception} will be {@code null}.
   */
  void done(Exception exception);
}
