.class public final synthetic Lcom/tenjin/android/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;


# instance fields
.field public final synthetic a:Lcom/tenjin/android/TenjinSDK;


# direct methods
.method public synthetic constructor <init>(Lcom/tenjin/android/TenjinSDK;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/a;->a:Lcom/tenjin/android/TenjinSDK;

    return-void
.end method


# virtual methods
.method public final onEventsLoaded(Ljava/util/List;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tenjin/android/a;->a:Lcom/tenjin/android/TenjinSDK;

    invoke-static {v0, p1}, Lcom/tenjin/android/TenjinSDK;->a(Lcom/tenjin/android/TenjinSDK;Ljava/util/List;)V

    return-void
.end method
