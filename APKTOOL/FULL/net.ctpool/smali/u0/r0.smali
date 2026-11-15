.class public final synthetic Lu0/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz3/c;


# instance fields
.field public final synthetic a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/r0;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lz3/l;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lu0/r0;->a:Ljava/lang/String;

    invoke-static {v0, p1}, Lu0/w0;->e(Ljava/lang/String;Lz3/l;)Lz3/l;

    move-result-object p1

    return-object p1
.end method
