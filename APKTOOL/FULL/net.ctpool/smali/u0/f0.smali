.class public final synthetic Lu0/f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LS5/b;


# direct methods
.method public synthetic constructor <init>(LS5/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/f0;->a:LS5/b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/f0;->a:LS5/b;

    invoke-static {v0}, Lu0/p0;->h(LS5/b;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
