.class public Lio/invertase/firebase/app/ReactNativeFirebaseAppRegistrar;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/components/ComponentRegistrar;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getComponents()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb4/c;",
            ">;"
        }
    .end annotation

    const-string v0, "react-native-firebase"

    sget-object v1, Lio/invertase/firebase/app/c;->a:Ljava/lang/String;

    invoke-static {v0, v1}, LL4/h;->b(Ljava/lang/String;Ljava/lang/String;)Lb4/c;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
