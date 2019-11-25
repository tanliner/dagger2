### Dagger2

[参考博客地址: Dagger2 学习历程：从一头雾水到恍然大悟](https://gold.xitu.io/post/58722866128fe1006b33e104)
[原文-Github](https://github.com/a5533348/dagger2_MVP)

### 更新依赖
Android Studio 3.5.2<br>
Gradle Plugin 3.5.2<br>
Gradle 5.4.1<br>
```
implementation fileTree(dir: 'libs', include: ['*.jar'])
implementation "androidx.appcompat:appcompat:1.1.0"

implementation 'com.jakewharton:butterknife:10.2.0'
annotationProcessor 'com.jakewharton:butterknife-compiler:10.2.0'


implementation 'com.google.dagger:dagger:2.16'
annotationProcessor 'com.google.dagger:dagger-compiler:2.16'

implementation 'com.squareup.okhttp3:okhttp:3.12.0'
implementation 'com.squareup.retrofit2:retrofit:2.5.0'
implementation 'com.squareup.retrofit2:converter-gson:2.5.0'
implementation 'com.squareup.retrofit2:adapter-rxjava:2.5.0'
implementation 'io.reactivex.rxjava2:rxjava:2.2.0'
implementation 'io.reactivex.rxjava2:rxandroid:2.1.0'
```
