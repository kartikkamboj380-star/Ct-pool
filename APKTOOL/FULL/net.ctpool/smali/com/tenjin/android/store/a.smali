.class public final synthetic Lcom/tenjin/android/store/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lcom/tenjin/android/store/TenjinDatasource;

.field public final synthetic n:Ljava/util/Map;

.field public final synthetic o:Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;


# direct methods
.method public synthetic constructor <init>(Lcom/tenjin/android/store/TenjinDatasource;Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/tenjin/android/store/a;->m:Lcom/tenjin/android/store/TenjinDatasource;

    iput-object p2, p0, Lcom/tenjin/android/store/a;->n:Ljava/util/Map;

    iput-object p3, p0, Lcom/tenjin/android/store/a;->o:Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/tenjin/android/store/a;->m:Lcom/tenjin/android/store/TenjinDatasource;

    iget-object v1, p0, Lcom/tenjin/android/store/a;->n:Ljava/util/Map;

    iget-object v2, p0, Lcom/tenjin/android/store/a;->o:Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;

    invoke-static {v0, v1, v2}, Lcom/tenjin/android/store/TenjinDatasource;->e(Lcom/tenjin/android/store/TenjinDatasource;Ljava/util/Map;Lcom/tenjin/android/store/TenjinDatasource$TenjinCallback;)V

    return-void
.end method
