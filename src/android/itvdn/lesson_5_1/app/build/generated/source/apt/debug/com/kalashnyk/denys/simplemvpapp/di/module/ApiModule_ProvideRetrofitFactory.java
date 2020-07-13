// Generated by Dagger (https://google.github.io/dagger).
package com.kalashnyk.denys.simplemvpapp.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class ApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final ApiModule module;

  private final Provider<Retrofit.Builder> builderProvider;

  public ApiModule_ProvideRetrofitFactory(
      ApiModule module, Provider<Retrofit.Builder> builderProvider) {
    this.module = module;
    this.builderProvider = builderProvider;
  }

  @Override
  public Retrofit get() {
    return Preconditions.checkNotNull(
        module.provideRetrofit(builderProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApiModule_ProvideRetrofitFactory create(
      ApiModule module, Provider<Retrofit.Builder> builderProvider) {
    return new ApiModule_ProvideRetrofitFactory(module, builderProvider);
  }

  public static Retrofit proxyProvideRetrofit(ApiModule instance, Retrofit.Builder builder) {
    return Preconditions.checkNotNull(
        instance.provideRetrofit(builder),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
