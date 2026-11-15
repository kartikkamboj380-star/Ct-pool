.class public abstract Lcom/facebook/imagepipeline/nativecode/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Z


# direct methods
.method public static declared-synchronized a()V
    .locals 2

    .line 1
    const-class v0, Lcom/facebook/imagepipeline/nativecode/g;

    monitor-enter v0

    :try_start_0
    sget-boolean v1, Lcom/facebook/imagepipeline/nativecode/g;->a:Z

    if-nez v1, :cond_0

    const-string v1, "native-imagetranscoder"

    invoke-static {v1}, LN2/a;->d(Ljava/lang/String;)Z

    const/4 v1, 0x1

    sput-boolean v1, Lcom/facebook/imagepipeline/nativecode/g;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method
