.class public final synthetic Lu0/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:LS5/c;


# direct methods
.method public synthetic constructor <init>(LS5/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/j0;->a:LS5/c;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/j0;->a:LS5/c;

    invoke-static {v0}, Lu0/p0;->i(LS5/c;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
