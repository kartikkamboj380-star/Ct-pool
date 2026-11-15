.class public final synthetic Lr4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb4/g;


# instance fields
.field public final synthetic a:Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr4/a;->a:Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;

    return-void
.end method


# virtual methods
.method public final a(Lb4/d;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lr4/a;->a:Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;

    invoke-static {v0, p1}, Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;->a(Lcom/google/firebase/crashlytics/ndk/CrashlyticsNdkRegistrar;Lb4/d;)Le4/a;

    move-result-object p1

    return-object p1
.end method
