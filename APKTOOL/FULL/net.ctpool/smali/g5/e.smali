.class public final synthetic Lg5/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic m:Lg5/g;


# direct methods
.method public synthetic constructor <init>(Lg5/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/e;->m:Lg5/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lg5/e;->m:Lg5/g;

    invoke-static {v0}, Lg5/g;->b(Lg5/g;)V

    return-void
.end method
