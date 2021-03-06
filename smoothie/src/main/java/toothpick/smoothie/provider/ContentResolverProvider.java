package toothpick.smoothie.provider;

import android.app.Application;
import android.content.ContentResolver;
import javax.inject.Inject;
import javax.inject.Provider;

public class ContentResolverProvider implements Provider<ContentResolver> {
  Application application;

  @Inject
  public ContentResolverProvider(Application application) {
    this.application = application;
  }

  @Override
  public ContentResolver get() {
    return application.getContentResolver();
  }
}
