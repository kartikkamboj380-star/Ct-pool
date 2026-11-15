.class public final synthetic Ln3/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Ln3/x;


# direct methods
.method public synthetic constructor <init>(Ln3/x;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln3/s;->m:Ln3/x;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ln3/s;->m:Ln3/x;

    .line 2
    .line 3
    invoke-virtual {v0}, Ln3/x;->d()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
