.class public final synthetic Lcom/tenjin/android/store/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/tenjin/android/store/TenjinDatasource;


# direct methods
.method public synthetic constructor <init>(Lcom/tenjin/android/store/TenjinDatasource;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/store/f;->m:Lcom/tenjin/android/store/TenjinDatasource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tenjin/android/store/f;->m:Lcom/tenjin/android/store/TenjinDatasource;

    invoke-static {v0}, Lcom/tenjin/android/store/TenjinDatasource;->a(Lcom/tenjin/android/store/TenjinDatasource;)V

    return-void
.end method
